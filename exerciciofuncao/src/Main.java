import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("digite um numero para fatorar:");
        x = sc.nextInt();

        int fatorial = fat(x);
        result(fatorial);

        sc.close();
    }
    public static int fat(int num){
        int numero = 1;
        for (int i = 1; i<=num;i++ ){
            numero = numero * i;
            System.out.println(numero);
        }   return numero;
    }

    public static void result (int valor){
        System.out.println(valor);
    }

}
