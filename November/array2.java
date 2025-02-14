import java.util.Arrays;
import java.util.Scanner;
public class array2
{
    private int[] myarray;
    public array2(int[] arr)
    {
        this.myarray=arr;
    }
    public int getSum()
    {
        int total=0;
        for (int i:myarray)
        {
            total+=i;
        }
        return total;
    }
    public double getAverage()
    {
        int total=0;
        for (int i:myarray)
        {
            total+=i;
        }
        return (double) total/myarray.length;
    }
    public int getMode()
    {
        Arrays.sort(myarray);
        int mode=myarray[0];
        int maxCount=1;
        int currentCount=1;
        for (int i=1;i<myarray.length;i++)
        {
            if (myarray[i]==myarray[i-1])
            {
                currentCount++;
            }
            else
            {
                currentCount=1;
            }
            if (currentCount>maxCount)
            {
                maxCount=currentCount;
                mode=myarray[i];
            }
        }
        return mode;
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
        array2 ar2=new array2(arr);
        System.out.println("The sum of all the numbers is: "+ar2.getSum());
        System.out.println("The average of all the numbers is: "+ar2.getAverage());
        System.out.println("The mode of all the numbers is: "+ar2.getMode());
    }
}