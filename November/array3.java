import java.util.Scanner;
public class array3
{
    private int[] myarray;
    public array3(int[] arr)
    {
        this.myarray=arr;
    }
    public String findEven()
    {
        int count=0;
        for (int i:myarray)
        {
            if (i%2==0)
            {
                count+=1;
            }
        }
        if (count==0)
        {
            return "No element is even.";
        }
        else
        {
            return "At least one element is even.";
        }
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
        array3 ar3=new array3(arr);
        System.out.println(ar3.findEven());
    }
}
