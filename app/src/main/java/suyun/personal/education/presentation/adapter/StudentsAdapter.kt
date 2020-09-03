package suyun.personal.education.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import suyun.personal.education.R
import suyun.personal.education.data.Student
import suyun.personal.education.presentation.holders.GroupHolder
import suyun.personal.education.presentation.holders.StudentsHolder

// Assembly line (Конвеер)
class StudentsAdapter(var students: ArrayList<Student>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var STUDENT_TYPE = 1
    var GROUP_TYPE = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        Log.d("RecyclerView", "onCreateViewHolder")
        var view: View? = null
        when(viewType){
            GROUP_TYPE -> {
                view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_student, parent, false)
                GroupHolder(view)
            }
            else -> {
                view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_student, parent, false)
                StudentsHolder(view)
            }
        }
    }

    override fun getItemCount(): Int { return students?.size }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder , position: Int) {
        Log.d("RecyclerView", "onBindViewHolder")
        when(position%2){
            0 -> {(holder as GroupHolder)}
            1 -> {(holder as StudentsHolder).bind(students.get(position))}
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when(position%2){
            0 -> GROUP_TYPE
            else -> STUDENT_TYPE
        }
    }
}