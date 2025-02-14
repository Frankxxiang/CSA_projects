import java.util.ArrayList;
public class StudentArrayListTest {
    public static void main(String[] args) {
        ArrayList<StudentArrayList> studentArrayList = new ArrayList<>();
        studentArrayList.add(new StudentArrayList("John", 20));
        studentArrayList.add(new StudentArrayList("Jane", 21));
        System.out.println(studentArrayList.get(0).getName()); 
        System.out.println(studentArrayList.get(0).getAge());
    }
}
