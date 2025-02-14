import java.util.Arrays;
public class array8 {

    public static void main(String[]args){
        int[] numberlists={1,2,3,4,5};
        System.out.println("The original number list is: "+ Arrays.toString(numberlists));
        array8 obj= new array8();
        obj.Rotateright(numberlists);
        obj.printArray(numberlists);
    }

    public void Rotateright(int arr[]){
        int lastindex=arr[arr.length - 1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0]=lastindex;

    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}