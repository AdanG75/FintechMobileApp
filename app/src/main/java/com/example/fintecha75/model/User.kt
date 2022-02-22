package com.example.fintecha75.model

import android.util.Log

abstract class User {
    var idUser: Int? = null
    var email: String? = null
    var password: String? = null
    var typeUser: TypeUser? = null
    var account: PaypalAccount? = null

    fun setTypeUser(possibleTypeUser: String) {
        try {
            this.typeUser = TypeUser.valueOf(possibleTypeUser)
        }catch (exception: EnumConstantNotPresentException) {
            Log.d("Error", "Type User wasn't found")
            this.typeUser = TypeUser.CLIENT
        }
    }
}