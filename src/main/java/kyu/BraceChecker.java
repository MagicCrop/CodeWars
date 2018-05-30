package kyu;

public class BraceChecker {
    public boolean isValid(String braces) {
        String previous = "";
        
        while (braces.length() != previous.length()) {
            previous = braces;
            braces = braces
                    .replace("()", "")
                    .replace("[]", "")
                    .replace("{}", "");
        }
        
        return braces.length() == 0;
    }
}