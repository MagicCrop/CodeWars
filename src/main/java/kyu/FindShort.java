package kyu;

public class FindShort {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        String shortestWord = words[0];
        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        return shortestWord.length();
        
//better
//        return Stream.of(s.split(" "))
//                .mapToInt(String::length)
//                .min()
//                .getAsInt();
    }
}
