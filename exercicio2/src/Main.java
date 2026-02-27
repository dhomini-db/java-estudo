import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("|soma de dois numeros|");

        System.out.print("digite o primeiro numero:");
        int n1 = sc.nextInt();
        System.out.print("digite o segundo numero:");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        System.out.printf("A soma de %d + %d é = %d %n",n1,n2,soma);
    }
}