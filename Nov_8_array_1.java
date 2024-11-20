public class Nov_8_array_1{
    public static void main(String[] args) {
        int[] age = new int[5];
        age[1] = 23;
        System.out.println("value at age["+1+"]="+ age[1]);
        for (int i = 0; i <5; i++){
            age[i]=i+17;
        }
        System.out.println("*******************************");
        for (int i=0;i<5;i++){
            System.out.println("value at age["+i+"]="+ age[i]);
        }
    }
}