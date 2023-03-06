package com.example.catatanpenjualan.model

import com.google.gson.annotations.SerializedName


@Generated("com.robohorse.robopojogenerator")

data class User (

        @field:SerializedName("id_user")
        var password:String?=null,

        @field:SerializedName("username")
        var hp:String?=null,

        @field:SerializedName("email")
        var id_user:String?=null,

        @field:SerializedName("password")
        var create_date:String?=null,

        @field:SerializedName("hp")
        var email:String?=null,

        @field:SerializedName("create_date")
        var username:String?=null
): java.io.Serializable

annotation class Generated(val value: String)

