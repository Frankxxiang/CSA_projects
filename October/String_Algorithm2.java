public class String_Algorithm2 {
    public String displayReverseName(String text){
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.substring(i, i + 1)+" at ["+i+"]\n";
        }
        return result;
    }

    public static void main(String[] args){
        String_Algorithm2 sa1 = new String_Algorithm2();
        System.out.println(sa1.displayReverseName("Frank"));
    }
}