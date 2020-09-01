package suyun.personal.education.presentation.contracts

abstract interface BasePresenter<T : BaseView> {
    abstract fun <T> attach(view: T)
}