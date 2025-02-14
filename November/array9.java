public class array9 {
    private int[] myarray;
    public array9(int[] arr){
        this.myarray = arr;
    }
    public int[] reverse(){
        int[] rarr= new int[myarray.length];
        for (int i=0;i<myarray.length;i++){
            rarr[i]=myarray[myarray.length-1-i];
        }
        return rarr;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        array9 obj = new array9(numbers);
        int[] narr=obj.reverse();
        System.out.print("{");
        for (int word:narr){
            System.out.print(word+" ,");
        }
        System.out.println("}");
    }
}
