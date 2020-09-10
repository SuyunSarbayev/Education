package suyun.personal.education.domain

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import suyun.personal.education.data.RatesRepository

class RequestCurrencyUseCase : BaseUseCase<CurrencyObject> {

    lateinit var ratesDomainRepository: RatesDomainRepository

    constructor() : super(Schedulers.io(), AndroidSchedulers.mainThread()){
        this.ratesDomainRepository = RatesRepository()
    }

    override fun createObservableObject(): Observable<CurrencyObject> {
        return ratesDomainRepository.initiateGetRates()
    }
}