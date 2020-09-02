package suyun.personal.education.presentation.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import suyun.personal.education.data.Student
import suyun.personal.education.presentation.fragments.DetailFragment
import suyun.personal.education.presentation.fragments.StudentsFragment

class ViewpagerStudentsAdapter(var students: ArrayList<Student>,
                               fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return DetailFragment().apply {
//            arguments = Bundle().apply{
//                putParcelable("Student", students.get(position))
//            }
        }
    }

    override fun getCount(): Int {
        return students.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Все"
            1 -> "По алфавиту"
            else -> "По оценкам"
        }
    }
}