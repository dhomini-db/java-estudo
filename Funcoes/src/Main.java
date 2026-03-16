import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*String original = "abc DEFG ABC abc DEFGHIH    ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(5);
        String s05 = original.substring(5,16);
        String s06 = original.replace("a","A");
        String s07 = original.replace("ABC","LA ELE");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");


        System.out.println(original+"-|");
        System.out.println(s01+"-|");
        System.out.println(s02+"-|");
        System.out.println(s03+"-|");
        System.out.println(s04+"-|");
        System.out.println(s05+"-|");
        System.out.println(s06+"-|");
        System.out.println(s07+"-|");
        System.out.println(i+"-|");
        System.out.println(j+"-|");
        */

        String s = "potato apple lemon";
        String [] vect = s.split(" ");
        String word1 = vect [0];
        String word2 = vect [1];
        String word3 = vect [2];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        sc.close();
    }
}