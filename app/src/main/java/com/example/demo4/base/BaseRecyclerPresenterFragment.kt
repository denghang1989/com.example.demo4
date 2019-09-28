package com.example.demo4.base

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.example.demo4.mvp.BaseModel
import com.example.demo4.mvp.BaseView
import com.example.demo4.mvp.RxPresenter

abstract class BaseRecyclerPresenterFragment<A : BaseQuickAdapter<*, BaseViewHolder>,P : RxPresenter<out BaseView ,out BaseModel>> :
    BaseRecyclerFragment<A>(), BaseView {

     var presenter: P?=null

    override fun init() {
        presenter = initPresenter()
        presenter?.attachView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.detach()
    }

    abstract fun initPresenter(): P

}