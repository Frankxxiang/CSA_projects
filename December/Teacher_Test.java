public class Teacher_Test {
    public static void main(String[] args) {
        Teacher Sam = new Teacher();
        Teacher Jack = new Teacher("Jack");
        Teacher Akash = new Teacher("Akash","Java");
        Sam.display_information();
        System.out.println("**************************");
        Jack.display_information();
        System.out.println("**************************");
        Akash.display_information();
        System.out.println("**************************");

    }
}
