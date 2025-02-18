public class ParticularProperty {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {  
            if (arr[i] == target) {  
                found = true;   
                break;   
            }
        }
        if (found) { 
            System.out.println("The target " + target + " was found in the array.");
        } else {  
            System.out.println("The target " + target + " was not found in the array.");
        }
        
    }
}