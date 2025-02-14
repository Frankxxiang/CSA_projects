public class String_algorithm {
    public String displayAllCharacters(String text,int n){
        String answer="";
        for(int i=0;i<text.length();i++){
            answer+=text.substring(i,i+1)+"  at: ["+i+"]\n";
        }
        return answer;
    }

    public static void main(String[] args) {
        String_algorithm a = new String_algorithm();
        System.out.println(a.displayAllCharacters("This is a test",0));
    }
}