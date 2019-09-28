package com.example.demo4.base

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.example.demo4.mvp.BaseModel
import com.example.demo4.mvp.BaseView
import com.example.demo4.mvp.RxPresenter

abstract class BaseRecyclerPresenterFragment<A : BaseQuickAdapter<*, BaseViewHolder>,P : RxPresenter<BaseView,BaseModel>> :
    BaseRecyclerFragment<A>(), BaseView {

     lateinit var presenter: P

    override fun init() {
        presenter = initPresenter()
        presenter.attachView(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }

    abstract fun initPresenter(): P

}