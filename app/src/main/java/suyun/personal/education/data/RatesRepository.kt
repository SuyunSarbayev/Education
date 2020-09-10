package suyun.personal.education.data

import io.reactivex.Observable
import suyun.personal.education.domain.CurrencyObject
import suyun.personal.education.domain.RatesDomainRepository
import java.lang.Exception

class RatesRepository : RatesDomainRepository{

    lateinit var apiImplementation: ApiImplementation

    constructor(){
        apiImplementation = ApiImplementation()
    }

    override fun initiateGetRates() : Observable<CurrencyObject>{
        return apiImplementation.initiateGetRates().map { response ->
            if(response.isSuccessful){
                response.body()
            }else{
                throw Exception()
            }
        }
    }
}