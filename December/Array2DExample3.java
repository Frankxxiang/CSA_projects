public class Array2DExample3 {
    public static void main(String[] args) {
        int[][] studentgrades = {{99,97,96},{98,90,97},{95,90,89},{88,90,80}};
        for (Object elem : studentgrades) {
            for (int i : (int[]) elem) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
