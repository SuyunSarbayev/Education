package suyun.personal.education

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.fragment_students.*

class StudentsFragment : Fragment() {

    var rootView: View? = null

    var name: String? = null

    val age: Int = 7

    var okay: String? = "Okay"

    // Завод
    var adapter: StudentsAdapter? = null

    var students: ArrayList<Student> = ArrayList<Student>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = LayoutInflater.from(context).inflate(R.layout.fragment_students, container, false)
        
        var arrayOfIn = arrayOf(1,2,3,4,5)

//        for(i in arrayOfIn){}
//
//        arrayOfIn.forEach { item ->
//
//        }
//
//        arrayOfIn.forEachIndexed { index, i ->  }
//
//        (0..arrayOfIn.size - 1).forEach(
//
//        )
//
//        (0..6).random()
//        if(5 in 16..73){
//
//        }
//        for (i in arrayOfIn) {
//
//        }

        when(5){
            4 -> {}
            3 -> {}
        }

        name is String
        name = null

        okay?.replaceALetter() ?: print("Okay this null")

        var counter = arrayOfIn.countFive()
//        new OnClickListener{
//
//        }
//
//        object: OnClickListener{
//
//        }

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

//    public String initializeDate(){
//        return ""
//    }
//
//    fun initializeData() : String{
//
//    }

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
        recyclerview_fragment_students?.adapter = adapter
    }

    fun initializeLayoutManager(){
        recyclerview_fragment_students?.layoutManager = LinearLayoutManager(context)
    }

    fun initializeViews(){}

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
