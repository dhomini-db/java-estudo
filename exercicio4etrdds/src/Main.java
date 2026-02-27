import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A,B,C,D, dif;
        System.out.print("Digite o primeiro numero:");
        A = sc.nextInt();

        System.out.print("Digite o segundo numero:");
        B = sc.nextInt();

        System.out.print("Digite o terceiro numero:");
        C = sc.nextInt();

        System.out.print("Digite o quarto numero:");
        D = sc.nextInt();

        dif = A * B - C * D;

        System.out.printf("A diferença desses numeros é = %d", dif);
    }
}