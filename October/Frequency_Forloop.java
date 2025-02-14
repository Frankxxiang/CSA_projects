import java.util.Scanner;
public class Frequency_Forloop {
    public static void main(String[] args) {
        int frequency = countFrequency();
        System.out.println("The frequency of the number 5 is: " + frequency);
    }
    public static int countFrequency() {
        Scanner scanner = new Scanner(System.in);
        int fr = 0;
        for (int i =1; i <=10; i++){
            System.out.println("Enter the number:");
            int input = scanner.nextInt();
            if (input >=5){
                fr++;
            }
        }
        return fr;
    }

}
