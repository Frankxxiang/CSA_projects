public class xc {
    public static void main(String[] args) {
        double number =  5.0 / 3;
        int nearestint = (int) (number + 0.5);
        System.out.println("5.0/3 = " + number);
        System.out.println("5/3 truncated：" + (int) number);
        System.out.println("5.0/3 roundede to nearest int: " + nearestint);
        double negnumber = number;
        int nearestnegint = (int) (negnumber - 0.5);
        System.out.println("-5.0/3 rounded to nearest negative int:" + nearestint);
    }
}
