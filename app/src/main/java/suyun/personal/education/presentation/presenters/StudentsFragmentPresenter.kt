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

        view?.initializeUpdateData(students)
        view?.initiateNotifyChanged()
    }
}