
import java.util.Arrays;

public class array5 {
    private int[] myarray;
    public array5(int[] arr){
        this.myarray=arr;
        Arrays.sort(myarray);
    }
    public boolean findpairs(){
        int interval = myarray[1]-myarray[0];
        for (int i = 2; i<myarray.length;i++){
            if (myarray[i]-myarray[i-1]!=interval){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9};
        int[] numbers2={1,3,5,7,9,11};
        array5 obj =new array5(numbers);
        if(obj.findpairs()){
            System.out.println("it's consecutive");
        }
        else{
            System.out.println("it is not consecutive");
        }
        
    }
}
