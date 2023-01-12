package com.jk.test

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class AndroidTest {
    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.firstEt)).perform(ViewActions.typeText("4"))
            Espresso.onView(withId(R.id.firstEt)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.secondEt)).perform(ViewActions.typeText("5"))
            Espresso.onView(withId(R.id.secondEt)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.calculateBtn)).perform(ViewActions.click())
            delay(3000)
            Espresso.onView(withId(R.id.resultTv))
                .check(ViewAssertions.matches(ViewMatchers.withText("9.0")))
        }
    }

    @Test
    fun simpleDivision() {
        runBlocking {
            Espresso.onView(withId(R.id.firstEt)).perform(ViewActions.typeText("10"))
            Espresso.onView(withId(R.id.firstEt)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.secondEt)).perform(ViewActions.typeText("2"))
            Espresso.onView(withId(R.id.secondEt)).perform(ViewActions.closeSoftKeyboard())
            delay(3000)
            Espresso.onView(withId(R.id.calculateBtn)).perform(ViewActions.click())
            delay(3000)
            Espresso.onView(withId(R.id.resultTv))
                .check(ViewAssertions.matches(ViewMatchers.withText("5.0")))
        }
    }
}