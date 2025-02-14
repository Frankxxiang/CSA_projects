public class StringExample1 {
    // 定义一个字符串变量 name，并初始化为 "jacky"
    String name= "jacky";
    // 使用 new 关键字创建一个新的字符串对象 name1，并初始化为 "Hey frank how are you doing today?"
    String name1 = new String("Hey frank how are you doing today?");

    // 显示两个字符串的长度
    public void DisplayLength() {
        System.out.println("Length of the first string is " + name.length());
        System.out.println("Length of the second string is " + name1.length());
    }

    // 从字符串中提取子字符串并显示
    public void subString(int from, int to){
        System.out.println(name.substring(from, to));
        System.out.println(name1.substring(2,5));
    }

    // 获取字符串中指定字符或子字符串的索引并显示
    public void getindex(){
        System.out.println(name.indexOf("a"));
        System.out.println(name1.indexOf("y")); 
        System.out.println(name1.indexOf("r"));
    }

    // 主方法，程序的入口点
    public static void main(String[] args) {

        StringExample1 st1 = new StringExample1();
        st1.DisplayLength();
        st1.subString(1, 3);
        st1.getindex();
    }
}