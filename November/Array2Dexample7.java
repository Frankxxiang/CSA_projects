public class Array2Dexample7 {
public static int getindexoflastelementsmallerthantarget(int[] values, int target){
    for (int index=values.length-1;index>=0;index--){
        if (values[index]<target){
            return index;
        }
    }
    return -1;
}
public static void main(String[] args) {
    int[] values = {-30,-5,8,23,46};
    int target = 50;
    int index = getindexoflastelementsmallerthantarget(values, target);
    if (index == -1) {
        System.out.println("There is no element smaller than " + target);
    } else {
        System.out.println("The last element smaller than " + target + " is at index " + index);
    }
}
}

