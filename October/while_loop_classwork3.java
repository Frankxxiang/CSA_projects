import java.util.Scanner;
public class while_loop_classwork3 {
    public static void main(String[] args) {
        String result = casw();
        System.out.println(result);
    }
    public static String casw(){
        System.out.println("Enter a number: ");
        
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Enter the divisor");
        int y = input.nextInt();
        boolean R = true;
        while (R==true){
            x = x-y;
            if (x<=0){
                R = false;
            }
        }
        if (x!=0){
            return "not divisible";
        }
        else{
            return "divisible";
        }
    }
}
