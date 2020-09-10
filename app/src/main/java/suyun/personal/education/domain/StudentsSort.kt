package suyun.personal.education.domain

import suyun.personal.education.data.Student

class StudentsSort(var students: ArrayList<Student>) {

    fun randomList(){
        students.shuffle()
    }

    fun studentsSortABC(){}
}