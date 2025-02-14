import java.util.Scanner;
public class Replace10_29 {

    public Boolean flag(String input){
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i+1).equals("1")){
                return true;
            }
        }
        return false;
    }
    public String replaceword(String input){
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i+1).equals("1")){
                String str1 = input.substring(0,i);
                String str2 = input.substring(i+1);
                input = str1 + "l" + str2;
                return input;
            }
    }
        return input;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Replace10_29 replace10_29 = new Replace10_29();

        
        while (replace10_29.flag(str)== true){
            str = replace10_29.replaceword(str);
        }
        String result = replace10_29.replaceword(str);
        System.out.println(result);
    }

}
