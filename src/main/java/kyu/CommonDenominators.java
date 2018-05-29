package kyu;

// 5 kyu
public class CommonDenominators {
    public static String convertFrac(long[][] lst) {
        if(lst.length == 0) return "";
        
        long lcm = lst[0][1];
        StringBuilder result = new StringBuilder();
    
        for (long[] aLst : lst) {
            lcm = getLCM(lcm, aLst[1]);
        }
    
        for (int i = 0; i < lst.length; i++) {
            lst[i][0] = (lcm / lst[i][1]) * lst[i][0];
            lst[i][1] = lcm;
        
            result
                    .append("(")
                    .append(lst[i][0])
                    .append(",")
                    .append(lst[i][1])
                    .append(")");
        }
        return result.toString();
    }
    
    public static long getGCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
    
    public static long getLCM(long a, long b) {
        return a * (b / getGCD(a, b));
    }
}