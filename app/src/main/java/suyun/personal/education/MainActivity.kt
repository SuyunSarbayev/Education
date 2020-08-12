package suyun.personal.education

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textviewHello: TextView

    var titleUserName: String = "Hello"
    var titleCategory: String = "Hello"

    var orderId: Int = 0

    companion object{
        var KEY_ORDER_ID = "KEY_ORDER_ID"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textviewHello = findViewById(R.id.textview_activity_main)
        textviewHello.setText("Okay")
        textviewHello.setTextColor(Color.parseColor("#ff0000"))
    }

    fun initializeViews(){
        textviewHello = findViewById(R.id.textview_activity_main)
    }

    fun initiateCount() : Int{
        return 2 + 2
    }
}
