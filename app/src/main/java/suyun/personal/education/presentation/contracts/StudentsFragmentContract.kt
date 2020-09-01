package suyun.personal.education.presentation.contracts

import suyun.personal.education.data.Student

interface StudentsFragmentContract {
    interface View : BaseView{
        fun initializeAdapter()

        fun initializeLayoutManager()

        fun initializeRecyclerView()

        fun initializeViews()

        fun initializeUpdateData(students: ArrayList<Student>)

        fun initiateNotifyChanged()

        fun initializePresenter()

        fun initiateDetailTransition()
    }

    interface StudentsPresenter<View>{
        fun initializeData()
    }
}