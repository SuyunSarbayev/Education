package suyun.personal.education

import android.app.Application
import androidx.multidex.MultiDexApplication
import androidx.room.Room
import suyun.personal.education.data.EducationDatabase

class EducationApplication : MultiDexApplication() {

    var db: EducationDatabase? = null

    override fun onCreate() {
        super.onCreate()
        instance = this
        db = Room.databaseBuilder(this, EducationDatabase::class.java, "education.db").build()
    }

    companion object {
        val TAG = EducationApplication::class.java.simpleName

        lateinit var instance: EducationApplication
            private set
    }
}