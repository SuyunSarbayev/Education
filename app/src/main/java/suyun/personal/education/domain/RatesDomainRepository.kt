package suyun.personal.education.domain

import io.reactivex.Observable

interface RatesDomainRepository {
    fun initiateGetRates(): Observable<CurrencyObject>
}