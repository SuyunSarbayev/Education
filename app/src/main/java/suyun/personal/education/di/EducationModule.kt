package suyun.personal.education.di

import dagger.Module
import dagger.Provides
import suyun.personal.education.data.Backpack
import suyun.personal.education.data.Dog
import suyun.personal.education.data.Student

@Module
class EducationModule {

    @Provides
    fun providesStudent(backpack: Backpack) : Student{
        return Student(backpack)
    }

    @Provides
    fun initiateProvidesBackpack(dog: Dog) : Backpack{
        return Backpack(dog)
    }

    @Provides
    fun initiateProvidesDog(): Dog{
        return Dog()
    }
}