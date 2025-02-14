import java.util.Scanner;
public class SpellChecker {
private String[] wordlist={"apple","banana","orange","pear","grape","pineapple","watermelon","kiwi","mango","peach","pineapple"};
private String[] meaning={"a round fruit with red or green skin and a white flesh","a long curved fruit with a yellow skin and a soft flesh","a round fruit with orange skin and a soft flesh","a small sweet fruit with a green skin and a soft flesh","a small sweet fruit with a green skin and a soft flesh","a small sweet fruit with a green skin and a soft flesh","a small sweet fruit with a green skin and a soft flesh","a small sweet fruit with a green skin and a soft flesh","a small sweet fruit with a green skin and a soft flesh","a small sweet fruit with a green skin and a soft flesh"};
public static void print10(String arr1[],String arr2[]){
    for(int i=0;i<5;i++){
        System.out.println("the meaning of the word "+arr1[i]+" is "+arr2[i]);
    }
}
public static void speelcheck(String arr1[],String arr2[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a word to check its meaning:");
    String word = input.nextLine();
    for(int i=0;i<arr1.length;i++){
        if(word.equals(arr1[i])){
            System.out.println("the meaning of the word "+word+" is "+arr2[i]);
            break;
        }
        else if(i==arr1.length-1){
            System.out.println("the word is not in the dictionary");
        }
    }

}
public static void main(String[] args) {
    SpellChecker obj = new SpellChecker();
    obj.print10(obj.wordlist,obj.meaning);
    obj.speelcheck(obj.wordlist,obj.meaning);
}
}
