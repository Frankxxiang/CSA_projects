import java.util.ArrayList;
import java.util.Scanner;
public class Binary_search_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        Binary_search_arraylist obj = new Binary_search_arraylist();
        int result = obj.BSA(arr, x);
        if (result!=-1){
            System.out.println("Element found at "+result);
        }else{
            System.out.println("Element not found");
        }

    }

    public int BSA(ArrayList<Integer> arr, int x){
        int right = arr.size()-1;
        int left = 0;
        int mid;
        while (left<=right){
            mid = (right+left)/2;
            if (arr.get(mid)<x){
                left = mid+1;
            }else if(arr.get(mid)>x){
                    right = mid-1;
                }
            else{
                return mid;
            }
        }
        return -1;
    }
}

