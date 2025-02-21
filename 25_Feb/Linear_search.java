import java.util.Scanner;
public class Linear_search {
    public static int SequentialSearch(int[] elements, int find){
        for (int i =0; i <elements.length;i++){
            if(elements[i]==find){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {5,1,7,2,9,4,-1};
        System.out.println("Test sequential search");
        Scanner sc = new Scanner(System.in);
        int fing = sc.nextInt();
        int result = SequentialSearch(numbers, fing);
        if (result>1){
            System.out.println(fing+ " found at "+ result);

        }
        else{
            System.err.println("not found");
        }
    }
}
