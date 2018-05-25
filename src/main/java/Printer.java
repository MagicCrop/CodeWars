public class Printer {
    
    public static String printerError(String s) {
        int result = 0;
        
        for (char i : s.toLowerCase().toCharArray()) {
            if (i > 'm')
                result++;
        }
        return String.format("%d/%d", result, s.length());
    }
}