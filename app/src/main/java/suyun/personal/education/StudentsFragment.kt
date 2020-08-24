package suyun.personal.education

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentsFragment : Fragment() {

    var rootView: View? = null

    // Завод
    var recyclerView: RecyclerView? = null

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
        initializeViews()
        initializeData()
        initializeAdapter()
        initializeRecyclerView()
        initializeLayoutManager()
    }

    fun initializeAdapter(){
        adapter = StudentsAdapter(students)
    }

    fun initializeData(){
        students.add(Student().apply { name = "John" })
        students.add(Student().apply { name = "John2" })
        students.add(Student().apply { name = "John3" })
        students.add(Student().apply { name = "John4" })
        students.add(Student().apply { name = "John5" })
        students.add(Student().apply { name = "John6" })
        students.add(Student().apply { name = "John7" })
        students.add(Student().apply { name = "John8" })
        students.add(Student().apply { name = "John9" })
        students.add(Student().apply { name = "John10" })
    }

    fun initializeRecyclerView(){
        recyclerView?.adapter = adapter
    }

    fun initializeLayoutManager(){
        recyclerView?.layoutManager = LinearLayoutManager(context)
    }

    fun initializeViews(){
        recyclerView = rootView?.findViewById(R.id.recyclerview_fragment_students)
    }
}