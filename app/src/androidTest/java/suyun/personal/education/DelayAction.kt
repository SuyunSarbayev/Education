package suyun.personal.education

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import org.hamcrest.Matcher

class DelayAction : ViewAction {

    var delay: Long = 100

    constructor(delay: Long){
        this.delay = delay
    }

    override fun getDescription(): String {
        return "delay action"
    }

    override fun getConstraints(): Matcher<View> {
        return ViewMatchers.isClickable()
    }

    override fun perform(uiController: UiController?, view: View?) {
        uiController?.loopMainThreadForAtLeast(delay)
    }
}