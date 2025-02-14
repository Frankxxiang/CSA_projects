public class MathClassExample {
    public void Checkmathmethods(){
        System.out.println(Math.abs(-5));
        System.out.println(Math.abs(-5.5));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.random()+1000);
        System.out.println(Math.max(10, 7));
        System.out.println(Math.min(3, 5));
    }

    public static void main(String[] args) {
        MathClassExample obj = new MathClassExample();
        obj.Checkmathmethods();
    }
}