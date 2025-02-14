import java.util.Scanner;

public class FL5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num;
        int count = 0;

        while (count < 10) {
            System.out.println("Enter a number : ");
            num = scanner.nextInt();

            sum += num;

            count++;
        }

        double average = sum / 10.0;

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The average of the numbers is: " + average);

        scanner.close();
    }
}