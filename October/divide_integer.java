import java.util.Scanner;
public class divide_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = input.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = input.nextInt();
        String output = divide(dividend, divisor);
        System.out.println(output);

    }
    public static String divide(int dividend, int divisor) {
        if (divisor == 0) {
            return "Error: Division by zero";
        }
        if (dividend == 0) {
            return "0";
        }
        for (;dividend > 0; dividend-=divisor){
        
        }
        if (dividend != 0) {
            return "undivisible" ;
        } else {
            return "divisible";
        }

    }
}