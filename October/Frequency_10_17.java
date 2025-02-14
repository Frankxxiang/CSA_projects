import java.util.Scanner;
public class Frequency_10_17 {
    public static void main(String[] args) {
        int count = frequncey();
        System.out.println("The number of numbers greater than 5 is: "+count);
    }

    public static int frequncey() {
        int count = 0;
        Scanner input = new Scanner(System.in);
        int a=0;
        while (a<10){
            System.out.println("Enter a number:");
            int b = input.nextInt();
            if (b>5){
                count++;
            }
            a++;
        }
        return count;
        
        }
    }
        