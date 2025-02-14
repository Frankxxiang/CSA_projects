public class autoboxingexample {
    public void displayage_AutoBoxing(Integer i){
        Integer age = i;
        System.out.println("after boxing your age is:"+age);
    }

    public void displayage_AutoUnboxing(int age){
        System.out.println("after unboxing your age is:"+age);
    }

    public static void main(String[] args) {
        autoboxingexample obj = new autoboxingexample();
        obj.displayage_AutoBoxing(5);
        obj.displayage_AutoUnboxing(6);
    }
}
