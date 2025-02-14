import java.util.Scanner;

public class Animal_guessing {
    public static void main(String[] args) {
        System.out.println("Is it a mammal?");
        try (Scanner ani_name = new Scanner(System.in)) {
            String answer1 = ani_name.next();
            if (answer1.equals("no")) {
                System.out.println("It is a bird!");
            } else {
                System.out.println("Is this animal a pet?");
                String answer2 = ani_name.next();

                if (answer2.equals("yes")) {
                    System.out.println("It is a dog!");
                } else {
                    System.out.println("It is an elephant!");
                }
            }
        } // 自动关闭 Scanner
    }
}
