package suyun.personal.education.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
class StudentEntity {

    @PrimaryKey(autoGenerate = true)
    var _id: Int = 0

    @SerializedName("name")
    var name: String = ""
}