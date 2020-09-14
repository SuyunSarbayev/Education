package suyun.personal.education

open class BasePageObject {

    companion object{
        inline fun<reified T: BasePageObject> on(): T{
            val page = T::class.constructors.first().call()
            return page
        }
    }
}