public class developingstrings {
    public String function(String text,int n){
        if(text.length()==1){
            return text+"   at: ["+n+"]\n";
        }
        return text.substring(0,1)+"   at:["+n+"]\n"+function(text.substring(1,text.length()),n+1);
    }

    public static void main(String[] args) {
        developingstrings a = new developingstrings();
        System.out.println(a.function("This is a test",0));
    }
}

