package com.kantapp.gsonwithkotlin.Kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.kantapp.gsonwithkotlin.R


/**
 * Created by Kantapp Inc. on 05-06-2018.
 */

class GSON : AppCompatActivity() {

    private val TAG = "GSONKT.java"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gson)

        getAnimeList()
        getContactDetails()
    }

    private fun getAnimeList() {
        val requestQueue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(Request.Method.GET, "http://gomcineplex.com/data/anime/dailyHD.json", Response.Listener { response ->
            val gson = Gson()

            val dailyAnimeList = gson.fromJson<List<DailyAnime>>(response, object : TypeToken<List<DailyAnime>>() {

            }.type)

            Toast.makeText(this@GSON, "" + dailyAnimeList.size, Toast.LENGTH_SHORT).show()
            Log.d(TAG, "onResponse: $dailyAnimeList")
        }, Response.ErrorListener { error -> Log.d(TAG, "onResponse: $error") })

        requestQueue.add(stringRequest)
    }

    private fun getContactDetails() {
        val requestQueue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(Request.Method.GET, "https://api.androidhive.info/contacts/", Response.Listener { response ->
            val gson = Gson()

            val contacts = gson.fromJson(response, Contacts::class.java)

            Log.d(TAG, "onResponse: " + contacts)
        }, Response.ErrorListener { error -> Log.d(TAG, "onResponse: $error") })
        requestQueue.add(stringRequest)

    }
}
