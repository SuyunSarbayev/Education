package suyun.personal.education.data

import android.util.Log

public class Student(var backpack: Backpack) {
    var name: String = ""

    fun initiatePrintName(){
        Log.d("Name", "Simple name")

        backpack.initiatePrintBackpack()
    }
}