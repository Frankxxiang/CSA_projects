import java.util.Scanner;
public class calcualtemod {
    public static void main(String[] args){
        int a=mod();
        System.out.println("The modulus is " + a);
    }
    public static int mod(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number1:");
        int num1 = input.nextInt();
        System.out.println("Enter a number2:");
        int num2 = input.nextInt();
        int m = num1 % num2;
        return m;
        
        }

    }

