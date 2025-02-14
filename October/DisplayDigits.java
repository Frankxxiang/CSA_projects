import java.util.Scanner;
public class DisplayDigits {
    public static void main(String[] args) {
        display();
    }
    public static void display(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int length = String.valueOf(num).length();
        int a = 0;
        while (a<length){
            System.out.println(num%10);
            a = a+1;
            num = num/10;
        }
    }
}

