package suyun.personal.education

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId

class LoginPage : BasePageObject() {

    fun initiatePressButton(){
        onView(withId(R.id.button_activity_main_fill_data)).perform(ViewActions.click())
    }
}