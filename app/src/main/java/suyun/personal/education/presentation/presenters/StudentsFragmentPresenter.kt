package suyun.personal.education.presentation.presenters

import suyun.personal.education.data.Student
import suyun.personal.education.presentation.contracts.StudentsFragmentContract

class StudentsFragmentPresenter : StudentsFragmentContract.StudentsPresenter<StudentsFragmentContract.View> {

    var view: StudentsFragmentContract.View? = null

    fun initializeView(view: StudentsFragmentContract.View){
        this.view = view
    }

    override fun initializeData(){
        var students: ArrayList<Student> = ArrayList<Student>()

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

        view?.initializeUpdateData(students)
        view?.initiateNotifyChanged()
    }
}