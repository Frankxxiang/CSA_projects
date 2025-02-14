
import java.util.Scanner;

public class display_digits_forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        display_digits(num);
    }
    public static void display_digits(int num) {
        String str = String.valueOf(num);
        for(int i=0; i<str.length(); i++) {
            System.out.println(str.substring(i,i+1));
        }
}
}
