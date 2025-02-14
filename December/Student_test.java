public class Student_test {
public static void main(String[] args) {
    Student Devy = new Student();
    Student Bryce = new Student("Bryce");
    Student Frank = new Student("Frank","AP301",20222008,17);
    Devy.print();
    System.out.println("*************************");
    Bryce.print();
    System.out.println("*************************");
    Frank.print();
    System.out.println("*************************");
}
}
