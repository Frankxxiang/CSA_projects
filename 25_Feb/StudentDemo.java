public class StudentDemo extends Person{
    private int GPA;
    public StudentDemo(String name, int age, int gpa){
        super(name,age);
        this.GPA = gpa;
    }
    public StudentDemo(String name, int age){
        super(name,age);
        this.GPA = 0;
    }
    public int getGPA(){
        return GPA;
    }
}

