import java.util.Scanner;
public class computesumaverage {
            public static void main(String[] args) {
                sum();
                
            }
            public static void sum(){
                Scanner input = new Scanner(System.in);
                int count = 0;
                int sum = 0;
                while (count < 10){
                    System.out.print("Enter a number: ");
                    int n = input.nextInt();
                    sum += n;
                    count++;
                }
                int average = sum / 10;
                System.out.println("The sum is " + sum);
                System.out.println("The average is " + average);
                
            }
}
