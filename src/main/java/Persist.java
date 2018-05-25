class Persist {
    public static int persistence(long n) {
        long sum = 1;
        
        if (n / 10 == 0) return 0;
        
        for (long number = n; number != 0; number /= 10)
            sum *= number % 10;
        
        return persistence(sum) + 1;
    }
}