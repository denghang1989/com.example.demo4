package com.example.demo4.mvp

interface PatientMvp {

    interface View {
        fun showLoading()

        fun hideLoading()

        fun showData()
    }

    interface Presenter {
        fun getPatientList(locId: String)
    }
}

class PatientPresenter : RxPresenter<BaseView,BaseModel>(),PatientMvp.Presenter{

    override fun getPatientList(locId: String) {

    }

}