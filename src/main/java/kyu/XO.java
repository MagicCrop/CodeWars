package kyu;

public class XO {
    public static boolean getXO(String str) {
        String[] letters = str.toLowerCase().split("");
        int x = 0, o = 0;
        
        for (String letter : letters) {
            if (letter.equals("x"))
                x++;
            else if (letter.equals("o"))
                o++;
        }
        
        return x == o;
        
        //clever
        //str = str.toLowerCase();
        //return str.replace("o","").length() == str.replace("x","").length();
    }
}
