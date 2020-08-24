package suyun.personal.education

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout

class MainActivity : AppCompatActivity() {

    var frameLayoutFragmentContainer: FrameLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeDefaultFragment()
    }

    fun initializeViews(){
        frameLayoutFragmentContainer = findViewById(R.id.framelayout_activity_main_fragment_container)
    }

    fun initializeDefaultFragment(){
        var loginFragment = StudentsFragment()

        supportFragmentManager
            .beginTransaction()
            .add(R.id.framelayout_activity_main_fragment_container, loginFragment)
            .commit()
    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFE", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LIFE", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFE", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFE", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFE", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LIFE", "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("LIFE", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d("LIFE", "onRestoreInstanceState")
    }
}