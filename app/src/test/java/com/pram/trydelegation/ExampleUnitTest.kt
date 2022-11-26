package com.pram.trydelegation

import android.net.Uri
import io.mockk.every
import io.mockk.mockkObject
import org.junit.Test

import org.junit.Assert.*
import java.net.URI

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun try_mockk_object() {
        mockkObject(MockObj)

        assertEquals(3, MockObj.add(1, 2))

        every { MockObj.add(1, 2) } returns 55

        assertEquals(55, MockObj.add(1, 2))
    }

    @Test
    fun try_mockk_static() {
        assertEquals(URI("http", "test", "path"), Uri.parse("http://test/path"))
    }
}

object MockObj {
    fun add(a: Int, b: Int) = a + b
}