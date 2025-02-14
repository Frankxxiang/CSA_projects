import java.util.Scanner;
public class calmodfor {

    public int calculatemod(int x, int y){
        int n = 1;
        for (int p = 1;p <= 100; p++)
            n = y-x;
            if (n>0){
                y =n;
            }
            else{
                return y;
            }
        return n;
    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the divisor: ");
        int a = input.nextInt();
        System.out.print("Enter the dividend: ");
        int b = input.nextInt();
        calmodfor obj = new calmodfor();
        int result = obj.calculatemod(a,b);
        System.out.println(result);
    }
}
