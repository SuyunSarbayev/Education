package suyun.personal.education

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class UiTestExample {

    lateinit var basicConfiguration: BasicConfiguration

    @Before
    fun prepare(){
        basicConfiguration = BasicConfiguration()
    }

    @After
    fun tearDown() { }

    @Test
    fun initiateTest() {
        DelayAction(5000)
        LoginPage().initiatePressButton()
    }
}