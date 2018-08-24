package kyu

fun race(v1: Int, v2: Int, g: Int): IntArray {
    if (v1 >= v2) return intArrayOf()

    val time = (v2 - v1).toDouble() / 3600
    var seconds = (g.toDouble() / time).toInt()

    return intArrayOf(seconds / 3600, (seconds / 60) % 60, seconds % 60)
}
