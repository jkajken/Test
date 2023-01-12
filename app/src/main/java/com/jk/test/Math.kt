package com.jk.test

class Math {

    fun add(a: String, b: String): String {

        var result = ""
        if (a.isNumeric() && b.isNumeric()) {
            result = (a.toInt() + b.toInt()).toString()

        } else if (a.isEmpty() || b.isEmpty()) {
            result = "Fill the fields"
        } else if (a.contains("  ") || b.contains("  ")) {
                result = "Make sure you do not have space"
            } else {
                result = "You entered letter"
            }
        return result
    }

    fun divide(a: String, b: String): String {

        var result = ""
        if (a.isNumeric() && b.isNumeric()) {
            result = (a.toInt() / b.toInt()).toString()


        } else if (a.isEmpty() || b.isEmpty()) {
            result = "Fill the fields"
        }else if (a.contains("   ")||b.contains("   ")){
            result = "Make sure you do not have spaces"
        } else if (b == "0.0") {
            result = "Can not divide by zero"
        } else {
            result = "You entered letter"
        }
        return result
    }

    fun String.isNumeric(): Boolean {
        val regex = "-?[0-9]+(\\.[0-9]+)?".toRegex()
        return this.matches(regex)
    }
}
