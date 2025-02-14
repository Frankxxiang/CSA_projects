public class PetTest {
    public static void main(String[] args) {
        Pet devy = new Pet("Devy","峨眉山 ","monkey",17,80);
        Pet cat = new Pet();
        Pet dog = new Pet("Bryce","H14z AP Center ","Chinese dog",18,80);
        System.out.println(dog.getinfo());
        System.out.println(devy);
        System.out.println(cat);
        cat.Setter("Frank", "Lion", "King", 17, 75);
        System.out.println(cat);
    }
}
