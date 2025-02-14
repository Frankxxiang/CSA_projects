public class Find_min_max {
    int[][] myarray;

    public Find_min_max(int[][] arr) {
        this.myarray = arr;
    }

    public int[] findmax_min() {
        int[] Result = new int[2];
        Result[0] = myarray[0][0]; // 初始化最小值
        Result[1] = myarray[0][0]; // 初始化最大值

        for (int[] row : myarray) {
            for (int num : row) {
                if (num < Result[0]) {
                    Result[0] = num; // 更新最小值
                }
                if (num > Result[1]) {
                    Result[1] = num; // 更新最大值
                }
            }
        }

        return Result;
    }

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {6, 9, 3}, {2, 10, 34}, {2, 0, 0}};
        Find_min_max obj = new Find_min_max(numbers);
        for (int num : obj.findmax_min()) {
            System.out.println(num);
        }
    }
}
