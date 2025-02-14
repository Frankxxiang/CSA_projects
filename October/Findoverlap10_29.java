import java.util.Scanner;
public class Findoverlap10_29 {
    public int Findover(String input, String pattern){
        int len = input.length();
        int fre = 0;
        for (int i = 0; i < pattern.length() + 1-len; i++){
            if(pattern.substring(i,i+len).equals(input)){
                fre +=1;
            }
        }
        return fre;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String input = scanner.nextLine();
        System.out.println("Enter the pattern string:");
        String pattern = scanner.nextLine();
        Findoverlap10_29 findoverlap10_29 = new Findoverlap10_29();
        int fre = findoverlap10_29.Findover(input, pattern);
        System.out.println("The frequency of the pattern in the input string is: " + fre);
    }
}
