package kyu;

/* Description:
You have a positive number n consisting of digits. You can do at most one operation: Choosing the index of a digit in the number, remove this digit at that index and insert it back to another place in the number.

Doing so, find the smallest number you can get.

#Task: Return an array or a tuple or a string depending on the language (see "Sample Tests") with

1) the smallest number you got
2) the index i of the digit d you took, i as small as possible
3) the index j (as small as possible) where you insert this digit d to have the smallest number.
Example:

smallest(261235) --> [126235, 2, 0] or (126235, 2, 0) or "126235, 2, 0"
126235 is the smallest number gotten by taking 1 at index 2 and putting it at index 0

smallest(209917) --> [29917, 0, 1] or ...

[29917, 1, 0] could be a solution too but index `i` in [29917, 1, 0] is greater than
index `i` in [29917, 0, 1].
29917 is the smallest number gotten by taking 2 at index 0 and putting it at index 1 which gave 029917 which is the number 29917.

smallest(1000000) --> [1, 0, 6] or ... */

public class ToSmallest {
    //This is the best solution (could not find a solution on my own)
    public static long[] smallest(long n) {
        return new long[]{0};
//        long min = n;
//        int index1 = 0;
//        int index2 = 0;
//        String number = String.valueOf(n);
//        for (int i = 0; i < number.length(); i++) {
//            for (int j = 0; j < number.length(); j++) {
//                if (i != j && making(number, i, j) < min) {
//                    min = making(number, i, j);
//                    index1 = i;
//                    index2 = j;
//                }
//            }
//        }
//        return new long[]{min, index1, index2};
    }
//
//    public static long making(String s, int i, int j) {
//        StringBuilder sb = new StringBuilder(s);
//        char c = sb.charAt(i);
//        sb.deleteCharAt(i);
//        sb.insert(j, c);
//
//        return Long.valueOf(sb.toString());
//    }
}
