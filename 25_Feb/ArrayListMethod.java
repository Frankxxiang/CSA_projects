import java.util.ArrayList;
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();
        shoppingList.add("laptop");
        shoppingList.add("Mobile");
        shoppingList.add("Cake");
        String item = shoppingList.set(0,"Ring");
        System.out.println(item);
        System.out.println("Element at index 0: "+ shoppingList.get(0));
    }
}
