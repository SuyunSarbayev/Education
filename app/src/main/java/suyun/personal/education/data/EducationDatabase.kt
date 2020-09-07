package suyun.personal.education.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(StudentEntity::class), version = 2)
abstract class EducationDatabase : RoomDatabase(){
    abstract fun getStudentDao(): StudentDao
}