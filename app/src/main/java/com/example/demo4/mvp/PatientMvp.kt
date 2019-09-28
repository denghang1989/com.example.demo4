package com.example.demo4.mvp

import com.example.demo4.controller.Patient

interface PatientMvp {

    interface View {
        fun showLoading()

        fun hideLoading()

        fun showData(patients: List<Patient>)
    }

    interface Presenter {
        fun getPatientList(locId: String)
    }
}

class PatientPresenter : RxPresenter<BaseView, BaseModel>(), PatientMvp.Presenter {

    override fun getPatientList(locId: String) {

    }

}