package com.example.demo4.controller

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.example.demo4.R
import com.example.demo4.base.BaseRecyclerPresenterFragment
import com.example.demo4.mvp.PatientMvp
import com.example.demo4.mvp.PatientPresenter

class PatientFragment:BaseRecyclerPresenterFragment<PatientAdapter, PatientPresenter>(),PatientMvp.View{

    override fun initPresenter(): PatientPresenter {
        return PatientPresenter()
    }

    override fun iniAdapter(): PatientAdapter {
        return PatientAdapter(R.layout.item_patient)
    }

    override fun initData() {

    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun showData() {

    }

}

class PatientAdapter(layoutId:Int): BaseQuickAdapter<PatientModel, BaseViewHolder>(layoutId) {

    override fun convert(helper: BaseViewHolder, item: PatientModel?) {

    }

}

data class PatientModel(var name:String,var age:Int)