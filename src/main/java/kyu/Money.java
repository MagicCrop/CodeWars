package kyu;

public class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int years = 0;
        while (principal < desired) {
            double i = principal * interest;
            i -= i * tax;
            principal += i;
            years++;
        }
        return years;
    }
}
