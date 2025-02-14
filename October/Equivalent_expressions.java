public class Equivalent_expressions {
    public static void main(String[]args){
        int x=-1;
        System.out.println(!(x==0 || x>=1));
        System.out.println(!(x==0)&&!(x>=1));
        System.out.println((x!=0)&&(x<1));
    }
}
