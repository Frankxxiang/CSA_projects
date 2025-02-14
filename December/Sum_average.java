public class Sum_average {
    int[][] myarray;

    public Sum_average(int[][] arr) {
        this.myarray = arr;
    }

    public int findsum() {
        int Result = 0;
        for (int[] row : myarray) {
            for (int num : row) {
                Result += num;
            }
        }
        return Result;
    }

    public double findAverage() {
        int sum = findsum();
        int count = 0;
        for (int[] row : myarray) {
            count += row.length;
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {6, 9, 3}, {2, 10, 34}, {2, 0, 0}};
        Sum_average obj = new Sum_average(numbers);
        System.out.println("Sum: " + obj.findsum());
        System.out.println("Average: " + obj.findAverage());
    }
}
