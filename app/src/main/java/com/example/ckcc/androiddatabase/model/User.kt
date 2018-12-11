package com.example.ckcc.androiddatabase.model

import java.io.Serializable

class User(  var Photo: String? = null,
             var firstName: String? = null,
             var lastName: String? = null,
             var Gender: String? = null,
             var Email: String? = null,
             var Phone: String? = null,
             var Password: String? = null) : Serializable {}