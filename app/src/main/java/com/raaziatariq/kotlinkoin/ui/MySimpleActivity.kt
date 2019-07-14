package com.raaziatariq.kotlinkoin.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.raaziatariq.kotlinkoin.R
import com.raaziatariq.kotlinkoin.databinding.ActivityMySimpleBinding
import com.raaziatariq.kotlinkoin.presenter.MySimplePresenter
import org.koin.android.ext.android.inject

class MySimpleActivity : AppCompatActivity() {

    val firstPresenter: MySimplePresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMySimpleBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_my_simple);
        binding.text = firstPresenter.sayHello()
    }
}
