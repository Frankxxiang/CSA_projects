public class Student {
    private String name;
    private String classname;
    private int Id;
    private int age;
    public Student(){
        name="";
        classname="";
        Id=000000;
        age=18;
    }
    public Student(String name){
        this.name = name;
    }
    public Student(String name, String classname, int Id, int age){
        this.name = name;
        this.classname = classname;
        this.Id = Id;
        this.age = age;
    }
    public void print(){
        System.out.println("the name of the student is: "+ name);
        System.out.println("the class name of the student is: "+ classname);
        System.out.println("the Id of the student is: "+ Id);
        System.out.println("the age of the student is: "+ age);
    }

}
