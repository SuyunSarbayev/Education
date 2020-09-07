package suyun.personal.education.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDao  {
    @Insert
    fun initiateInsertStudent(student: StudentEntity)

    @Delete
    fun initiateDeleteStudent(student: StudentEntity)

    @Query("SELECT * FROM studententity")
    fun initiateGetStudents() : List<StudentEntity>
}