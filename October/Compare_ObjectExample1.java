public class Compare_ObjectExample1 {
    public static void main(String[] args) {
        String a=new String("Hello");
        String b=new String("Hello");
        String c=new String("Welcome");
        String d=c;
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a.equals(c));
        System.out.println(d==c);
        System.out.println(d.equals(c));
    }

}
