package objectOrientedProgramming

import kotlin.NumberFormatException

fun main() {
    val stringValue: String? = null
    var intValue: Int = 0

    try {
        intValue = stringValue!!.toInt()
    } catch (e: NullPointerException) {
        intValue = 0
    } catch (e: NumberFormatException) {
        intValue = -1
    } finally {
        when(intValue) {
            0 -> println("NullPointerException triggered")
            -1 -> println("NumberFormatException triggered")
            else -> println(intValue)
        }
    }

}