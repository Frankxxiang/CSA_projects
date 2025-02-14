import java.util.Arrays;

public class array7 {

    private int[] myarray;

    public array7(int[] arr) {
        myarray = arr;
    }

    public int[] meetc() {
        // 先计算大于5的数的数量
        int count = 0;
        for (int num : myarray) {
            if (num > 5) {
                count++;
            }
        }


        int[] iaar = new int[count];
        int index = 0;
        for (int num : myarray) {
            if (num > 5) {
                iaar[index++] = num;
            }
        }

        return iaar;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 55, 6, 7, 8, 9, 0, 10, 34, 23, 12, 98, 234, 23, 45 };
        array7 obj = new array7(numbers);
        int[] output = obj.meetc();

        System.out.println("number larger than 5 and its frequency:");
        
        int[] counts = new int[output.length];

        for (int i = 0; i < output.length; i++) {
            if (counts[i] == 0) { 
                int count = 1; // 计数器，从 1 开始
                for (int j = i + 1; j < output.length; j++) {
                    if (output[i] == output[j]) {
                        count++;
                        counts[j] = -1; // 标记为已统计的数字
                    }
                }
                System.out.println(output[i] + " frequency: " + count);
            }
        }
    }
}
