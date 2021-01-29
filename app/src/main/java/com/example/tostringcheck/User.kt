package com.example.tostringcheck

data class User(val id: Int,
                val name: String? = "",
                val gender : Boolean,
                val address : String? = "") { }
