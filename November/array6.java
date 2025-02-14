public class array6 {

    private int[] myarray;
    public array6(int[]arr){
        myarray=arr;
    }
    public boolean checkduplicate(){
        for(int i=0;i<myarray.length-1;i++){
            for (int k=i+1;k<myarray.length;k++){
                if(myarray[i]==myarray[k]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8};
        array6 obj = new array6(numbers);
        if (obj.checkduplicate()){
            System.out.println("Have duplication");}
        else{
            System.out.println("Don't have duplication");
        }
        

    }
}
