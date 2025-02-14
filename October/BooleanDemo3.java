public class BooleanDemo3 {
    public static void main(String[] args) {
        Human_ Nicho=new Human_();
        Human_ Sophie = new Human_();
        Human_ friend=Nicho;
        
        System.out.println(Nicho==Sophie); // false
        System.out.println(Nicho==friend); // true
        System.out.println(Nicho!=Sophie); // false
        System.out.println(Nicho!=friend); // false
        }
}