import java.util.Scanner;
public class Nov_8_array_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("how many weights do you want to store");
        int num = input.nextInt();
        double[] array = new double[num];
        for (int i=1;i<=num;i++){
            System.out.println("enter the ["+i+"] number you want");
            array[i-1]=input.nextDouble();

        }
        System.out.println("*******************************");
        for (int i=0;i<num;i++){
            System.out.println("weight at array["+i+"]="+ array[i]);
        }

    }
}
