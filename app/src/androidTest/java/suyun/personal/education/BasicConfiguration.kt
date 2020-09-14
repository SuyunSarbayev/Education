package suyun.personal.education

import android.content.Context
import android.content.Intent
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until

class BasicConfiguration {

    lateinit var context: Context

    lateinit var device: UiDevice

    lateinit var packageName: String

    var launchIntent: Intent?

    var LAUNCH_TIMEOUT = 10000L

    var BASIC_PACKAGE = "suyun.personal.education"

    constructor(){
        context = initializeContext()
        device = initializeDevice()
        pressHome()
        waitForLauncher()
        packageName = initializePackage()
        launchIntent = initializeLaunchIntent()
        launchIntent()
        waitForApp()
    }

    fun initializeDevice() : UiDevice {
        return UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
    }

    fun initializePackage() : String{
        return InstrumentationRegistry.getInstrumentation().targetContext.getPackageName();
    }

    fun pressHome(){
        device.pressHome()
    }

    fun waitForLauncher(){
        device.wait(Until.hasObject(By.pkg(device.launcherPackageName).depth(0)), LAUNCH_TIMEOUT)
    }

    fun initializeLaunchIntent() : Intent? {
        return context.getPackageManager().getLaunchIntentForPackage(packageName)?.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
    }

    fun launchIntent(){
        context.startActivity(launchIntent);
    }

    fun waitForApp(){
        device.wait(Until.hasObject(By.pkg(BASIC_PACKAGE).depth(0)), LAUNCH_TIMEOUT)
    }

    fun initializeContext() : Context {
        return EducationApplication.instance.applicationContext
    }
}