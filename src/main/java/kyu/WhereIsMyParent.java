package kyu;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

/* Description:
Mothers arranged dance party for children in school.On that party there are only mothers and their children.
All are having great fun on dancing floor when suddenly all lights went out.Its dark night and no one can see each other.
But you were flying nearby and you can see in the dark and have ability to teleport people anywhere you want.

Legend:
-Uppercase letters stands for mothers,lowercase stand for their children. I.E "A" mothers children are "aaaa".
-Function input:String contain only letters,Uppercase letters are unique.
Task:
Place all people in alphabetical order where Mothers are followed by their children.I.E "aAbaBb" => "AaaBbb". */

public class WhereIsMyParent {
    static String findChildren(final String text) {
        String[] list = text.split("");
        Arrays.sort(list, CASE_INSENSITIVE_ORDER.thenComparing(Comparator.naturalOrder()));
        
        return String.join("", list);
    }
}

/* More clear solution
    static String findChildren(final String text) {
        String[] sorted = text.split("");
        Arrays.sort(sorted);
        Arrays.sort(sorted, String.CASE_INSENSITIVE_ORDER);
        return String.join("", sorted);
    } */