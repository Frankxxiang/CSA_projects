public class StringMethodExample2 { // 定义一个名为StringMethodExample2的类
    String student1 = "William";
    String message = "Welcome";
    String student2 = "William";
    String student3 = "Welcome";

    public void compareString(){
        System.out.println(student1.compareTo(student2)); 
        System.out.println(student1.compareTo(message));
        System.out.println(student3.compareTo(student1)); 
    }

    public static void main(String[] args) { 
        StringMethodExample2 st3 = new StringMethodExample2(); // 
        st3.compareString(); 
    }
}