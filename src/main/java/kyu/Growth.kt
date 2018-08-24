package kyu

fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int {
    var population = pp0
    var years = 0
    while (population < p) {
        population += (population * (percent/100) + aug).toInt()
        years++
    }

    return years
}

// best
/*
fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int =
generateSequence(pp0) {
    it + (applyPercent(percent, it)) + aug
}.indexOfFirst { it >= p }

val applyPercent: (Double, Int) -> Int = {
a, b  -> (a/100*b).toInt()
}
^ i find this to be a bit unreadable i would prefer the next

generateSequence(pp0.toDouble()) { it * (1 + percent / 100) + aug }.takeWhile { it < p }.count()
 */
