public class arrayEXAMPLE_11_18 {
public static void main(String[] args) {
    String[] names = {"jamal","emily","Destiny","Mateo","Sofia"};
    int index = 1;
    System.out.println(names[index-1]);
    index++;
    System.out.println(names[index]);
    System.out.println(names[index/2]);
    names[index]="Rafi";
    index--;
    System.out.println(names[index+1]);
}
}
