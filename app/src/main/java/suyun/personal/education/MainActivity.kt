package suyun.personal.education

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var titleUserName: String = "Hello"

    var titleCategory: String = "Hello"

    var edittextName: EditText? = null

    var edittextSurname: EditText? = null

    var buttonAction: Button? = null

    var orderId: Int = 0

    companion object{
        var KEY_ORDER_ID = "KEY_ORDER_ID"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LIFE", "onCreate")
        setContentView(R.layout.activity_main)

        edittextName = findViewById(R.id.edittext_activity_main_name)
        edittextSurname = findViewById(R.id.edittext_activity_main_surname)
        buttonAction = findViewById(R.id.button_activity_main_fill_data)

        buttonAction?.setOnClickListener {
            edittextName?.setText("Name")
            edittextSurname?.setText("Surname")
        }
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
