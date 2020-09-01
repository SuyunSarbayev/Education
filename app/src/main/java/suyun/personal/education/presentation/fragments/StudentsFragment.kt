package suyun.personal.education.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.fragment_students.*
import suyun.personal.education.R
import suyun.personal.education.data.Student
import suyun.personal.education.presentation.adapter.StudentsAdapter
import suyun.personal.education.presentation.contracts.StudentsFragmentContract
import suyun.personal.education.presentation.presenters.StudentsFragmentPresenter

class StudentsFragment :
    StudentsFragmentContract.View,
    Fragment() {
    
    var presenter: StudentsFragmentPresenter? = null
    // Presenter

    // Model View Presenter

    // Interfaces
    var rootView: View? = null

    var name: String? = null

    // Завод
    var adapter: StudentsAdapter? = null

    var students: ArrayList<Student> = ArrayList<Student>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = LayoutInflater.from(context).inflate(R.layout.fragment_students, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializePresenter()
        initializeViews()
        initializeAdapter()
        initializeRecyclerView()
        initializeLayoutManager()
        presenter?.initializeData()
        initiateDetailTransition()
    }

    override fun initializePresenter() {
        presenter = StudentsFragmentPresenter()
        presenter?.initializeView(this)
    }

    override fun initiateDetailTransition() {
        var data = Bundle()

        data.putInt("Key", 1)

        var fragmentManager = activity?.supportFragmentManager

        fragmentManager?.beginTransaction()
            ?.add(R.id.framelayout_activity_main_fragment_container, DetailFragment().apply {
                arguments = data
            }, "DetailFragment")
            ?.commit()
    }

    override fun initializeAdapter(){
        adapter = StudentsAdapter(
            students
        )
    }

    override fun initializeUpdateData(students: ArrayList<Student>) {
        this.students.clear()
        this.students.addAll(students)
    }

    override fun initiateNotifyChanged() {
        adapter?.notifyDataSetChanged()
    }

    override fun initializeRecyclerView(){
        recyclerview_fragment_students?.adapter = adapter
    }

    override fun initializeLayoutManager(){
        recyclerview_fragment_students?.layoutManager = LinearLayoutManager(context)
    }

    override fun initializeViews(){}

    fun String.replaceALetter(){
        this.replace("o", "")
    }

    fun Array<Int>.countFive() : Int{
        var counter = 0
        this.forEach { item ->
            if(item == 5) counter++
        }
        return counter
    }

}
