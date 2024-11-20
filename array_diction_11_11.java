
import java.util.Scanner;

public class array_diction_11_11 {
    String[] Ewords = {"calculus","english literature","physics","devy","statistics"};
    String[] Cwords = {"微积分","英语文学","物理","猴子","统计"};
    public array_diction_11_11(){
        System.out.println("Welcome to java dictionary");
        System.out.print("enter the word you want to look up:");
    }

    public String foundword(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        // array_diction_11_11 dict = new array_diction_11_11();
        for (int i=0; i<5;i++){
            if (input.equals(Ewords[i])){
                return "the chinese tarsnlation of the word "+Ewords[i]+" is "+Cwords[i];
            }
        }
        return "not found in dictionary";
    }
    public static void main(String[] args) {
        array_diction_11_11 dic = new array_diction_11_11();
        String output = dic.foundword();
        System.out.println(output);
    }
}
