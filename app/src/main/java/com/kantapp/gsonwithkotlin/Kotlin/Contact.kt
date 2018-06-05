package com.kantapp.gsonwithkotlin.Kotlin

data class Contact(
        val id:String,
        val name:String,
        val email:String,
        val address:String,
        val gender:String,
        val phone:PhoneDetails
)
data class PhoneDetails(
       val mobile:String,
       val home:String,
       val office:String
)
