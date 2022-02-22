package com.example.fintecha75.model

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Client: User() {
    var clientName: String? = null
    var lastName: String? = null
    var dateOfBirth: String? = null
    var clientAddress: Address? = null
    var fingerprints: List<Fingerprint?> = mutableListOf()
}