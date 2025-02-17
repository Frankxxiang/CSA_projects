import java.util.ArrayList;
public class Arraylist_Practice1 {
    public static void main(String[] args) {    
    ArrayList<Integer> numbers= new ArrayList<Integer>();
    numbers.add(0);
    numbers.add(1);
    numbers.add(2);
    numbers.add(0);
    numbers.add(3);
    numbers.add(0);
    numbers.add(5);
    numbers.add(0);
    numbers.add(7);
    numbers.add(0);
    numbers.add(8);
    numbers.add(0);
    numbers.add(0);
    numbers.add(0);
    numbers.add(9);
    for (int i =0; i <numbers.size(); i++){
        if (numbers.get(i)==0){
            numbers.remove(i);
            i--;
        }
    }
    for (int j =0; j <numbers.size(); j++){
        System.out.print(numbers.get(j)+", ");
    }
    }
}
// The code removes all the 0's from the ArrayList and prints the remaining elements.