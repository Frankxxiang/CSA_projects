public class Animal {
    private String name;
    private int age;
    private String color;
    public Animal(String name,int age,String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    public String toString(){
        return "The name of the god is: "+this.name+" and the age of this dog is: "+this.age+ " the color of this dog is: "+this.color;


    }
    public static void main(String[] args) {
        Animal dog = new Animal("Devy",16,"black");
        System.out.println(dog);
    }

}
