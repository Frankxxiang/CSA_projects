public class FL8 {
    public static void main(String[] args) {
        double principal = 200;
        double interestRate = 0.10;
        int years = 50;

        for (int i = 1; i <= years; i++) {
            principal += principal * interestRate;
        }

        System.out.printf("The total amount after 50 years is " + principal);
    }
}