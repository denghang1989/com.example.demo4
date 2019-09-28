package com.example.demo4.mvp

interface PatientMvp {

    interface View : BaseView {
        fun showLoading()

        fun hideLoading()

        fun showData()
    }

    interface Model : BaseModel

    interface Presenter : BasePresenter<View> {
        fun getPatientList(locId: String)
    }
}

class PatientPresenter : RxPresenter<PatientMvp.View,PatientMvp.Model>(),PatientMvp.Presenter{

    override fun getPatientList(locId: String) {

    }

}