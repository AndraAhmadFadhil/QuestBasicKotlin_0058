package com.example.projectpam2

fun nullSafety() {
    //neverNull has String type
    var neverNull: String = "This can't be Null"

    // throws a compiler
    // neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"
    // This is ok
    nullable = null
}