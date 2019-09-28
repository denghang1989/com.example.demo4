package com.example.demo4.mvp

interface BaseView

interface BaseModel

interface BasePresenter<V: BaseView> {
    fun attachView(v:V)

    fun detach()
}

open class RxPresenter<V : BaseView, M : BaseModel> : BasePresenter<V> {
    var view: BaseView? = null
    var model: BaseModel? = null

    override fun attachView(v: V) {
        view = v
    }

    override fun detach() {
        view = null
    }

}