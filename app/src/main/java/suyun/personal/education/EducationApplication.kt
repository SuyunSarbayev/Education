package suyun.personal.education

import android.app.Application
import androidx.multidex.MultiDexApplication
import androidx.room.Room
import suyun.personal.education.data.EducationDatabase

class EducationApplication : MultiDexApplication() {

    var db: EducationDatabase? = null

    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(this, EducationDatabase::class.java, "education.db").build()
    }
}