import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        int x,N;
        int soma = 0;

        System.out.print("digite um repetidor:");
        N = sc.nextInt();

        for(int i=0;i < N;i++ ){
            System.out.print("digite um numero: ");
            x = sc.nextInt();
            soma = soma + x;
        }

        System.out.printf("a soma é = %d%n",soma);

        sc.close();
    }
}