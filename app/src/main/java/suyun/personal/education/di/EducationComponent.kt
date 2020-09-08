package suyun.personal.education.di

import dagger.Component
import suyun.personal.education.data.Backpack
import suyun.personal.education.data.Student
import suyun.personal.education.presentation.fragments.LoginFragment

@Component(modules = arrayOf(EducationModule::class))
public interface EducationComponentSuper {
    public fun injectBackpack() : Backpack

    public fun injectStudent() : Student

    public fun inject(loginFragment: LoginFragment)
}