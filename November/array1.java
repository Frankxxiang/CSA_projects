import java.util.Scanner;
public class array1 {
    private int[] myarray;
    public array1(int[] arr)
    {
        this.myarray=arr;
    }
    public int findmax()
    {
        int max=myarray[0];
        for (int i:myarray)
        {
            if (max<i)
            {
                max=i;
            }
        }
        return max;
    }
    public int findmin()
    {
        int min =myarray[0];
        for (int i:myarray)
        {
            if (min>i)
            {
                min=i;
            }
        }
        return min;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[10];
        for (int i=0;i<10;i++)
        {
            System.out.print("Please enter the "+(i+1)+"th number: ");
            arr[i]=scanner.nextInt();
        }   
        array1 ar1=new array1(arr);
        System.out.println("The greatest number is: "+ar1.findmax());
        System.out.println("The smallest number is: "+ar1.findmin());
    }
}
