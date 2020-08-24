package suyun.personal.education

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.viewholder_student.view.*

// Каркас
class StudentsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(student: Student){
        itemView?.textview_viewholder_student_name?.text = student.name
    }
}