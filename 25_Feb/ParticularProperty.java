public class ParticularProperty {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {   // loop through the array
            if (arr[i] == target) {   // if the current element is the target
                found = true;   // set the flag to true
                break;   // exit the loop
            }
        if (found) {   // if the target was found
            System.out.println("The target " + target + " was found in the array.");
        } else {   // if the target was not found
            System.out.println("The target " + target + " was not found in the array.");
        }
        }
    }
}
//  Determine atleast one element has a particular property :