public class Q2 {

    public static void main(String[]args){
        int guess=7;
        int answer=9;
        if(guess<answer){
            System.out.println("Your guess is too low");
        }
        else if (guess==answer) {
            System.out.println("Your are right");
        }
        else{
            System.out.println("Your guess is too high");
        }
    }
}

