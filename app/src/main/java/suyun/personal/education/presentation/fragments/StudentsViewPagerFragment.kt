package suyun.personal.education.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import suyun.personal.education.R

import kotlinx.android.synthetic.main.fragment_students_viewpager.*
import suyun.personal.education.data.Student
import suyun.personal.education.presentation.adapter.ImageAdapter
import suyun.personal.education.presentation.adapter.ViewpagerStudentsAdapter

class StudentsViewPagerFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = LayoutInflater.from(context).inflate(R.layout.fragment_students_viewpager, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeViewPager()
    }

    fun initializeViewPager(){
        viewpager_fragment_students?.adapter = ImageAdapter()
        viewpager_fragment_students?.currentItem = 2
        tablayout_fragment_students?.setupWithViewPager(viewpager_fragment_students)
    }
}