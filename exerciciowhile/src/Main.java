import java.util.Scanner;
public class Main {
    public static void main(){
        Scanner sc = new Scanner (System.in);

        int senha;

        System.out.print("digite a senha:");
        senha = sc.nextInt();


        while( senha != 2002){
            System.out.println("senha invalida");
            System.out.print("digite novamente:");
            senha = sc.nextInt();
        }
        System.out.println("senha valida");

        sc.close();
    }
}