package com.raaziatariq.kotlinkoin.presenter

import com.raaziatariq.kotlinkoin.repository.HelloRepository

class MySimplePresenter(val repo: HelloRepository) {

    fun sayHello() = "${repo.giveHello()} from $this"
}