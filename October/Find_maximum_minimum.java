
import java.util.Scanner;

public class Find_maximum_minimum {
    public static void main(String[] args) {
        mima();
    }
    public static void mima(){
        Scanner input = new Scanner(System.in);
        int count = 0;
        int a= 0;
        Integer b= null;
        while (count<10) {
            System.out.print("Enter the number: ");
            int n = input.nextInt();
            if (b==null){
                b=n;
                a=n;
            }
            if (n<a){
                a=n;
            }
            if (n>b){
                b=n;
            }
            count++;
        }
        System.out.println("The maximum number is: "+b);
        System.out.println("The minimum number is: "+a);

    }
}
