package com.example.projectpam2

fun ContohList() {
    println("=== List ===")

    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam List Mutable

    shape.add("Circle")
    println(shape)

    //Menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    //Mengubah data di dalam list Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

fun ContohSet() {
    println()
    println("=== Set ===")

    // Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // Set Mutable
    val shape: MutableSet<String> = mutableSetOf ("Circle", "Square", "Triangle")
    println(shape)
}

fun main() {
    ContohList()
}