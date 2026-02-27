import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nome;
        int idade;

        System.out.print("digite seu nome:");
        nome = sc.next();

        System.out.printf("ola %s%n",nome);

        System.out.print("digite sua idade:");
        idade = sc.nextInt();


        if(idade >= 2 && idade == 4){
            System.out.print("parabens");
        } else {
            System.out.println("nao parabens");
        }

        sc.close();

    }
}