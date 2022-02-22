package com.example.fintecha75.model

class Market: User() {
    var marketName: String? = null
    var marketType: String? = null
    var rfc: String? = null
    var branches: List<Branch?> = mutableListOf()
}