import java.util.Scanner;
public class Calculator_with_menu_11_1 {
    private Scanner scanner;
    public Calculator_with_menu_11_1() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("*********************Menu********************");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. square root");
        System.out.println("6. Power");
        System.out.println("7. (a+b)2");
        System.out.println("8. (a-b)2");
        System.out.println("9. exit");
        System.out.println("**********************************************");
    }

    public void add() {
        System.out.println("Enter two numbers to add:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }

    public void subtract() {
        System.out.println("Enter two numbers to subtract:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int difference = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);
    }

    public void multiply() {
        System.out.println("Enter two numbers to multiply:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
    }
    public void divide() {
        System.out.println("Enter two numbers to divide:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double quotient = (double) num1 / num2;
        System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
    }
    public void square_root() {
        System.out.println("Enter a number to find its square root:");
        int num = scanner.nextInt();
        double square_root = Math.sqrt(num);
        System.out.println("The square root of " + num + " is " + square_root);
    }
    public void power() {
        System.out.println("Enter two numbers to find their power:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int power = (int) Math.pow(num1, num2);
        System.out.println("The power of " + num1 + " and " + num2 + " is " + power);
    }
    public void a_plus_b_squared() {
        System.out.println("Enter two numbers to find (a+b)2:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int square = sum * sum;
        System.out.println("(a+b)2 is " + square);
    }
    public void a_minus_b_squared() {
        System.out.println("Enter two numbers to find (a-b)2:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int difference = num1 - num2;
        int square = difference * difference;
        System.out.println("(a-b)2 is " + square);
    }
    public Boolean exit() {
        System.out.println("Exiting the program...");
        return false;
    }

    public static void main(String[] args) {
        Calculator_with_menu_11_1 calculator = new Calculator_with_menu_11_1();
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;
        calculator.displayMenu();
        while (flag == true) {
            calculator.displayMenu();
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            if (choice == 1) {
                calculator.add();
            }else if (choice == 2) {
                calculator.subtract();
            }else if (choice == 3) {
                calculator.multiply();
            }else if (choice == 4) {
                calculator.divide();
            }else if (choice == 5) {
                calculator.square_root();
            }else if (choice == 6) {
                calculator.power();
            }else if (choice == 7) {
                calculator.a_plus_b_squared();
            }else if (choice == 8) {
                calculator.a_minus_b_squared();
            }else if (choice == 9) {
                flag = calculator.exit();
            }else {
                System.out.println("Invalid choice. Please try again.");
            }


        }
    }
}
