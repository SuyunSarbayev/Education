package suyun.personal.education.data

import io.reactivex.Observable
import retrofit2.Response
import suyun.personal.education.domain.CurrencyObject

class ApiImplementation : Api{

    var api: Api

    constructor(){
        api = ApiConnection().initializeAPIObject()
    }

    override fun initiateGetRates(): Observable<Response<CurrencyObject>> {
        return api?.initiateGetRates()
    }
}