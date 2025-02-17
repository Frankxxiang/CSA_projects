public class Min_Max {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}

// The above code finds the minimum and maximum values in an array using a for loop.