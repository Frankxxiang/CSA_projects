public class Class_example10_14 {
    public static void main(String[] args) {
        
    String s1 = null;
    String s2 = new String("hi");
    String s3 = new String("hi");
    String s4 = new String("bye");
    if(s1 == null){
        s1=s2;
    }
    if (s1 == s2) {
        System.out.println("s1 and s2 are the same object");
    }
    if (s2 == s3){
        System.out.println("s2 and s3 are the same object");
    }
    if (s3 == s4){
        System.out.println("s3 and s4 are the same object");
    }
    if (s1.equals(s2)&&s2.equals(s3)){
        System.out.println("s1, s2, and s3 are equal");
    }
}
}

