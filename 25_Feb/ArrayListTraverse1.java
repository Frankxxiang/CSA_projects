import java.util.ArrayList;
public class ArrayListTraverse1 {
    public static void main(String[] args) {
        ArrayList<String> namelist = new ArrayList<String>();
        namelist.add("John");
        namelist.add("Mary");
        namelist.add("Tom");
        namelist.add("David");
        for(String name : namelist) {
            System.out.println(name);
        }
        for (int i =0; i<namelist.size(); i++) {
            System.out.println(namelist.get(i));
        }
        int i =0;
        while (i<namelist.size()){
            System.out.println(namelist.get(i));
            i++;
        }
        for (String name : namelist) {
            namelist.remove(name);
            System.out.println(name);
            }
        
    }
}