package kyu

fun longest(s1:String, s2:String):String {
    return String((s1 + s2).toCharArray().distinct().sorted().toCharArray())
}

/*
return (s1 + s2).toSortedSet().joinToString("") <- better to do with toSortedSet()
 */
