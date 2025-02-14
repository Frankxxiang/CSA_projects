public class Q3 {
    public static void main(String[] args) {
        boolean doneHomework = true;
        boolean cleanedRoom = true;
        if (!(doneHomework && cleanedRoom))
            System.out.println("You cannot go out");
        else{
            System.out.println("You can go out");
        }
    }
}
