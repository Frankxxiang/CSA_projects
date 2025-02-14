public class Magic9ball {
    public static void main(String[] args) {
    //get a random number between 1 and 8
        int randomNum = (int)(Math.random() * 8) + 1;
        //use if statement to test the random number
        //and print out the 1 to 8 random responses
        if (randomNum == 1) {
            System.out.println("the number is 1");
        }
        else if (randomNum == 2) {
            System.out.println("the number is 2");
        }
        else if (randomNum == 3) {
            System.out.println("the number is 3");
        }
        else if (randomNum == 4) {
            System.out.println("the number is 4");
        }
        else if (randomNum == 5) {
            System.out.println("the number is 5");
        }
        else if (randomNum == 6) {
            System.out.println("the number is 6");
        }
        else if (randomNum == 7) {
            System.out.println("the number is 7");
        }
        else if (randomNum == 8) {
            System.out.println("the number is 8");
        }
        else {
            System.out.println("the number is not between 1 and 8");
        }
    }
}
