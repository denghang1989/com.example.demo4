package com.example.demo4.base

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import me.yokeyword.fragmentation_swipeback.SwipeBackActivity

abstract class BaseActivity<T:ViewDataBinding> :SwipeBackActivity(){

    lateinit var mDataBinding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataBinding = DataBindingUtil.setContentView<T>(this, getLayoutId())
        init()
        inject()
        initData()
        initEvent()
    }

    abstract fun initEvent():Unit

    abstract fun initData():Unit

    abstract fun getLayoutId(): Int

    abstract fun inject():Unit

    abstract fun init():Unit


}