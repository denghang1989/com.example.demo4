package com.example.demo4.api

import com.example.demo4.components.Patient

interface Api {

    val API_URL: String
        get() = "http://192.168.199.22/dthealth/web"

    suspend fun getPatientByLocId(locId:String):List<Patient>

}