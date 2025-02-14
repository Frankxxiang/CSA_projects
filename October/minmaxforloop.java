import java.util.Scanner;

public class minmaxforloop {
    
    public String minmaxfor() {
        Scanner input = new Scanner(System.in);
        Integer min = null;
        int max = 0;
        for(int i=1; i <= 10;i++){
            System.out.print("Enter number " + i + ": ");
            int num=input.nextInt();
            if(min == null){
                min = num;
                max = num;
            }
            else{
                if(num < min){
                    min = num;
                }
                if(num > max){
                    max = num;
                }
            }
            
        } 
        return "min"+min+"max"+max;

    }
    
    public static void main(String[] args) {
        minmaxforloop a = new minmaxforloop();
        System.out.println(a.minmaxfor());
    }
}