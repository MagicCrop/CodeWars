import java.util.HashMap;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String lower = text.toLowerCase();
        HashMap<Character, Integer> characterMap = new HashMap<>();
        
        lower.chars().forEach(c -> characterMap.merge((char) c, 1, (curVal, initVal) -> curVal + initVal));
        
        return (int) characterMap.entrySet().stream().filter(c -> c.getValue() > 1).count();
    }
}