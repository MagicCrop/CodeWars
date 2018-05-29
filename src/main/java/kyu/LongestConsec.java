package kyu;

class LongestConsec {
    
    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length;
        if (n == 0 || k > n || k <= 0)
            return "";
        
        String maxConsec = "";
        boolean stop = false;
        int max = 0;
        for (int i = 0; i < strarr.length; i++) {
            StringBuilder consec = new StringBuilder();
            for (int j = 0; j < k; j++) {
                if (i + j >= strarr.length) {
                    stop = true;
                    break;
                }
                consec.append(strarr[i + j]);
            }
            if (stop) {
                break;
            } else if (consec.length() > max) {
                max = consec.length();
                maxConsec = consec.toString();
            }
            
        }
        return maxConsec;
    }
}