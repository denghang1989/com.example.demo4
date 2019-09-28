package com.example.demo4.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.inflate
import androidx.databinding.ViewDataBinding
import me.yokeyword.fragmentation_swipeback.SwipeBackFragment

abstract class BaseFragment<T:ViewDataBinding>:SwipeBackFragment() {
    lateinit var dataBinding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inject()
        init()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = inflate(inflater,getLayoutId(),container,false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initData()
        initEvent()
    }

    abstract fun initEvent()

    abstract fun initData()

    abstract fun initView()

    abstract fun getLayoutId(): Int

    abstract fun init()

    protected fun inject(){

    }
}