package com.example.diceroller

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(5, 2 + 3)
    }
    @Test
    fun generates_number(){
        val dice = Dice(6)
        val diceResult = dice.roll()
        assertTrue("diceResult was not within 0 and 6", diceResult in 0..6)
    }

}