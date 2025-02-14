public class Even_odd {
    int[][] myarray;

    public Even_odd(int[][] arr) {
        this.myarray = arr;
    }

    public int[][] find_even_odd() {
        // 计算偶数和奇数的数量
        int evenCount = 0;
        int oddCount = 0;

        for (int[] row : myarray) {
            for (int num : row) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        // 初始化Result数组
        int[][] Result = new int[2][Math.max(evenCount, oddCount)];
        int evenIndex = 0, oddIndex = 0;

        for (int[] row : myarray) {
            for (int num : row) {
                if (num % 2 == 0) {
                    Result[0][evenIndex++] = num;
                } else if(num!=0) {
                    Result[1][oddIndex++] = num;
                }
            }
        }

        return Result;
    }

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {6, 9, 3}, {2, 10, 34}};
        Even_odd obj = new Even_odd(numbers); // 修正对象实例化
        System.out.print("Even numbers: { ");
        for (int num : obj.find_even_odd()[0]) {
            
            System.out.print(num+" " );
            
        }
        System.out.print("}");
        System.out.println();
        System.out.print("Odd numbers: { ");
        for (int num : obj.find_even_odd()[1]) {
            
            if(num!=0){
                System.out.print(num + " ");
            }

        }
        System.out.print("}");
    }
}
