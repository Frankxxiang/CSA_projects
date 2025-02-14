public class Staticexample {
    int x = 0;
    static int cnt = 0; // 将 cnt 声明为静态变量

    public int count() { // instance method
        x++;
        return x;
    }

    public static int static_count() {
        cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        // create an object
        Staticexample c1 = new Staticexample();
        Staticexample c2 = new Staticexample();
        Staticexample c3 = new Staticexample();
        System.out.println(c1.count());
        System.out.println(c2.count());
        System.out.println(c3.count());
        System.out.println(Staticexample.static_count()); // 通过类名调用静态方法
        System.out.println(Staticexample.static_count());
        System.out.println(Staticexample.static_count());
    }
}
