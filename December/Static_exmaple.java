public class Static_exmaple {
    private int count=0;
    public void increment(){
        count++;
    }
    public static void main(String[] args) {
        Static_exmaple se1 = new Static_exmaple();
        Static_exmaple se2 = new Static_exmaple();
        se1.increment();
        se2.increment();
        System.out.print(se2.count);
    }

}
