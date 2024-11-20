public class EnhancedForloop {
    public static void main(String[]args){

        String[] names ={"Christina","Bryce","Frank","Dora","Sam"};
        for(int i=0;i< names.length;i++){
        System.out.println(names[i]);
        }
        System.out.println("*************************************");
        for(String x: names){
            System.out.println(x);
        }
    }
}