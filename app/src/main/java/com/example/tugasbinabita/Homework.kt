package com.example.tugasbinabita

import android.os.Parcelable

@Parcelize
class Homework (
    var id: Int = 0,
    var title: String? = null,
    var description: String? = null,
    var date: String? = null
) : Parcelable