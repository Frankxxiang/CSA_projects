import java.util.Scanner;
public class Guessing_game {
    public static void main(String[] args) {
        gues();
    }
    public static void gues() {
        int random = (int) (Math.random() * 100) + 1;
        Scanner input = new Scanner(System.in);
        System.out.println("random number generated");
        System.out.println("Guess the number between 1 and 100:");
        int num = input.nextInt();
        while (num!= random) {
            if (num < random) {
                System.out.println("Too small, try again.");
            } else {
                System.out.println("Too big, try again.");
            }
            num = input.nextInt();
        }
        System.out.println("Congratulations, you guessed the number!");
    }
}
