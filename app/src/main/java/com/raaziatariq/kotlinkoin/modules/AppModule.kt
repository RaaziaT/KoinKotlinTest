package com.raaziatariq.kotlinkoin.modules

import com.raaziatariq.kotlinkoin.presenter.MySimplePresenter
import com.raaziatariq.kotlinkoin.repository.HelloRepository
import com.raaziatariq.kotlinkoin.repository.HelloRepositoryImpl
import org.koin.dsl.module

val appModule = module {

    // single instance of HelloRepository
    single<HelloRepository> { HelloRepositoryImpl() }

    // Simple Presenter Factory
    factory { MySimplePresenter(get()) }
}