public class human {
    String name = "Bryce";
    int age = 11;

    public void print() {
        System.out.print("Name: "+name+ "Age: "+age);
    }

    public static void main(String[] args) {
        human a = new human();
        a.print();

    }
}
