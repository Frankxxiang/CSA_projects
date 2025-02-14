public class Recursion {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("输入应为非负整数");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return x * power(x, n - 1);
        } else {
            return 1 / x * power(x, n + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        String a = "apple";
        String b = "";
        for (int i = a.length(); i > 0; i--) {
            System.out.print(a.substring(i-1, i));
            b += a.substring(i-1, i);
        }
        System.out.println();
        String c = "apple";
        double d=0.5;
        System.err.println(" oooo "); 
        System.out.println(c.substring(0, 0));

    }


}
