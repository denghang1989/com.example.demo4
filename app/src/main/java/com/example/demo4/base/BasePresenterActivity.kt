package com.example.demo4.base

import androidx.databinding.ViewDataBinding
import com.example.demo4.mvp.BasePresenter
import com.example.demo4.mvp.BaseView

abstract class BasePresenterActivity<T:ViewDataBinding,P:BasePresenter<BaseView>> :BaseActivity<T>(),BaseView{

    var presenter: P? = null

    override fun init() {
        presenter = initPresenter()
        presenter?.attachView(this)
    }

    abstract fun initPresenter(): P?

    override fun onDestroy() {
        super.onDestroy()
        presenter?.detachView()
    }
}