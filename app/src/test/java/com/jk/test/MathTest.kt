package com.jk.test

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    private var math: Math? = null

    @Before
    fun install(){
        math = Math()
    }

    @Test

    fun simpleTest(){
        assertEquals("4",math?.add("2","2"))
    }
    @Test

    fun letterTest(){
        assertEquals("You entered letter",math?.add("a","2"))
    }
    @Test
    fun symbolTest(){
        assertEquals("You entered symbol",math?.add("$@&*!! ","2"))
    }
    @Test
    fun doubleTest(){
        assertEquals("4.0",math?.add("2.0 ","2.0"))
    }
    @Test
    fun emptyTest(){
        assertEquals("Fill the fields",math?.add( "","2.0 "))
    }
    @Test
    fun spaceTest(){
        assertEquals("4.0",math?.add("       2.0 ","2.0 "))
    }

    @Test
    fun simpleDivide(){
        assertEquals("2.0",math?.divide("4.0 ","2.0"))
    }
    @Test
    fun zeroDivide(){
        assertEquals("0",math?.divide("4.0 ","0.0 "))
    }

    @After
    fun detach(){
        math = null
    }
}