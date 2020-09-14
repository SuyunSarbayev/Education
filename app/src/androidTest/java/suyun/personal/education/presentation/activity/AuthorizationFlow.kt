package suyun.personal.education.presentation.activity


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import suyun.personal.education.R

@LargeTest
@RunWith(AndroidJUnit4::class)
class AuthorizationFlow {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun authorizationFlow() {
        val appCompatEditText = onView(
            allOf(
                withId(R.id.edittext_activity_main_name),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.framelayout_activity_main_fragment_container),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatEditText.perform(replaceText("SSuyun"), closeSoftKeyboard())

        val appCompatEditText2 = onView(
            allOf(
                withId(R.id.edittext_activity_main_surname),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.framelayout_activity_main_fragment_container),
                        0
                    ),
                    1
                ),
                isDisplayed()
            )
        )
        appCompatEditText2.perform(replaceText("Sarbavev"), closeSoftKeyboard())

        val appCompatEditText3 = onView(
            allOf(
                withId(R.id.edittext_activity_main_name), withText("SSuyun"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.framelayout_activity_main_fragment_container),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatEditText3.perform(replaceText("Suyun"))

        val appCompatEditText4 = onView(
            allOf(
                withId(R.id.edittext_activity_main_name), withText("Suyun"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.framelayout_activity_main_fragment_container),
                        0
                    ),
                    0
                ),
                isDisplayed()
            )
        )
        appCompatEditText4.perform(closeSoftKeyboard())

        val appCompatButton = onView(
            allOf(
                withId(R.id.button_activity_main_fill_data), withText("Отправить данные"),
                childAtPosition(
                    childAtPosition(
                        withId(R.id.framelayout_activity_main_fragment_container),
                        0
                    ),
                    2
                ),
                isDisplayed()
            )
        )
        appCompatButton.perform(click())
    }

    private fun childAtPosition(
        parentMatcher: Matcher<View>, position: Int
    ): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
}
