package kyu

operator fun <T> String.invoke(obj: T): T = obj
/*
^ with this if T is invoked than return the object
 */
