package com.example.projectpam2

//Data class
//Data Class adalah class yang digunakan untuk menyimpan data
//data class menyediakan fungsi untuk meng-override fungsi equals(),hashcode(), dan toString().
//Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan berupa perubahan.

data class DataClass(
    val id: Int,
    var email: String
)