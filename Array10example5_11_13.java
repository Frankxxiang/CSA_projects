public class Array10example5_11_13 {
    public static void main(String[] args) {
        //1. Declare 3 arrays and initialize them to the given values
        String[] countries={"China","Egypt","France","Germany","India"};
        String[] Capitals={"Beijin","Cairo","Paris","Berlin","New Delhi"};
        String[] Languages={"Chinese","Arabic","French","German","Hindi"};
        double num = Math.random() * countries.length;
        int index = (int) num;
        System.out.println("the language of " + countries[index] + " is " + Languages[index]+" , and its capital is " + Capitals[index]);
// Countries: China, Egypt, France, Germany, India
// Capitals: Beijing, Cairo, Paris, Berlin, New Delhi
//Languages: Chinese, Arabic, French, German, Hindi
// 2. Pick a random number up to the length of one of the arrays and save in the variable index
// 3. Print out the info in each array using the random index.
    }
}
