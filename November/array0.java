public class array0 {

        private int[] myarray;
    
        //constructor
        public array0(int[] arr){
            this.myarray=arr;
        }
        public double GetAverage(){
            double total=0.0;
            for(int i : myarray){
                total+=i;
            }
            return total/myarray.length;
        }
        public static void main(String[]args){
            int[] arr={12,11,2,3,12,4,5,1,5};
            array0 ae1= new array0(arr);
            System.out.println("The Average of the elements in Array:"+ae1.GetAverage());
        }
    }

