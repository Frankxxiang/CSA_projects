import java.util.ArrayList;
import java.util.Scanner;
public class Linear_search_Arraylist {
    public int LinSearch(ArrayList <Integer> arr, int x){
        for(int i=0; i<arr.size(); i++){
            if (arr.get(i)==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        Linear_search_Arraylist obj = new Linear_search_Arraylist();
        int index =obj.LinSearch(arr, x);
        if (index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + index);
        }
    }
}
