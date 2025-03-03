class A{
    public A(){
        System.out.println("I am in A's constructor");
    }

}
class B extends A{
    public B(){
        System.out.println("I am in B's constructor");
    }
}
class C extends B{
    public C(){
        System.out.println("I am in C's constructor");
    }
    public C(String name){
        System.out.println("my name is "+name);
    }
}
public class Constructor_inheritence_example {
    public static void main(String[] args) {
        C cc = new C("frank");
    }

}
