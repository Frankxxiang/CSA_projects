public class Person {
    private String name;
    private int age;
    public Person(){
        name = "Ghost";
        age = 10000;
    }
    public Person (String n, int a){
        this.age=a;
        this.name=n;
    }
    public String getName(){
        return this.name;
    }
    public int getage(){
        return this.age;
    }
}
