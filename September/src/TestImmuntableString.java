public class TestImmuntableString {
    String name = "Akash";
    public void joingtwostring(){
        String newname=name+"pathak";
        System.out.println("New name is "+newname);
        newname+="\nHe teaches Java programming\n";
        System.out.println("New name is "+newname);
        String age = newname+"his age is "+37;
        System.out.println("Age is "+age);
    }
    public static void main(String[] args) {
        TestImmuntableString obj = new TestImmuntableString();
        obj.joingtwostring();
    }
}
