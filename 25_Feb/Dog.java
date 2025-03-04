public class Dog extends Pet{
    public Dog(String name){
        super(name,"dog");
        
    }
    public void speak(){
        System.out.println("Woof");
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Bryce");
        dog.speak();
        Cat cat = new Cat("Frank");
        cat.speak();
    }
}