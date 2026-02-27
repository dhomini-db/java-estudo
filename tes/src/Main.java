import java.util.Scanner;

public static void main (String []args){
    Scanner sc = new Scanner (System.in);
    String Nome;
    System.out.print("digite seu nome:");
    Nome = sc.next();

    System.out.println();

    System.out.printf("ola %s bem vindo",Nome);

    sc.close();
}