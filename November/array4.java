public class array4 {

    public void CheckMultipleOfThree(int arr[]) {
        boolean allMultipleOfThree = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 != 0) {
                allMultipleOfThree = false;
                break;
            }
        }
        if (allMultipleOfThree) {
            System.out.println("all the numbers are multiples of 3 ");
        } else {
            System.out.println("list has some number that is not the multiple of 3");
        }
    }

    public static void main(String[] args) {
        int[] numberlist = {3, 6, 9, 12, 15}; 
        array4 obj = new array4();
        obj.CheckMultipleOfThree(numberlist);
    }
}
