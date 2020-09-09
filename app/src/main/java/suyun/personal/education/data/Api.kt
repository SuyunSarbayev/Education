package suyun.personal.education.data

import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import suyun.personal.education.domain.CurrencyObject

interface Api {

    @GET(ApiConstants.LATEST_RATES)
    fun initiateGetRates() : Call<CurrencyObject>

}