package suyun.personal.education.data

import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.GET
import suyun.personal.education.domain.CurrencyObject

interface Api {

    @GET(ApiConstants.LATEST_RATES)
    fun initiateGetRates() : Observable<Response<CurrencyObject>>

}