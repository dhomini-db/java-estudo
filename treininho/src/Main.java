import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        System.out.print("digite um numero:");
        int x = sc.nextInt();

        sc.nextLine();

        System.out.println("digite a frase 1:");
        String a = sc.nextLine();
        System.out.println("digite a frase 2:");
        String b = sc.nextLine();
        System.out.println("digite a frase 3:");
        String c = sc.nextLine();

        System.out.println("dados digitados");
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}