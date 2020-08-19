package suyun.personal.education

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

    var array = arrayOf(6,7,4,5,6,7,8,9)


    companion object{
        var KEY_ORDER_ID = "KEY_ORDER_ID"
        val KEY_NAME = "suyun.personal.education.NAME"
        val KEY_SURNAME = "suyun.personal.education.SURNAME"
        val KEY_REQUEST_CODE = 1001
        val KEY_RESULT_CODE = 1002
        val KEY_RESULT_DATE = "suyun.personal_education.DATA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LIFE", "onCreate")
        setContentView(R.layout.activity_main)

        edittextName = findViewById(R.id.edittext_activity_main_name)
        edittextSurname = findViewById(R.id.edittext_activity_main_surname)
        buttonAction = findViewById(R.id.button_activity_main_fill_data)

        buttonAction?.setOnClickListener {
            initiateTransitionDetailActivity()
        }
    }

    fun initiateTransitionDetailActivity(){
        if(edittextName?.text?.toString()?.length ?: 0 > 0 && edittextSurname?.text?.toString()?.length ?: 0 > 0) {
            var intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(KEY_NAME, edittextName?.text.toString())
            intent.putExtra(KEY_SURNAME, edittextSurname?.text.toString())
            startActivityForResult(intent, KEY_REQUEST_CODE) //explicit
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == KEY_REQUEST_CODE){
            if(resultCode == KEY_RESULT_CODE){
                Log.d("DATA", data?.getStringExtra(KEY_RESULT_DATE) ?: "")
            }
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