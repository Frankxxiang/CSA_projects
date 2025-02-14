public class Teacher {
    private String name;
    private String subject_teach;
    public Teacher(){
        name="";
        subject_teach="";
    }
    public Teacher(String name){
        this.name=name;
        this.subject_teach="";
    }
    public Teacher(String name, String subject_teaching){
        this.name=name;
        this.subject_teach=subject_teaching;
    }
    public void display_information(){
        System.out.println("The teacher's name is: "+ name);
        System.out.println("The teacher's teaching subject is: "+ subject_teach);
    }
}
