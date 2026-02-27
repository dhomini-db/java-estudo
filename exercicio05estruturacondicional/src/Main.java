import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo,quantidade;
        double cachorro = 4.00;
        double xsalada = 4.50;
        double xbacon = 5.00;
        double torrada = 2.00;
        double refri = 1.50;
        double soma;


        System.out.println("(1)-Cachorro Quente (4.00 R$)");
        System.out.println("(2)-X-Salada (4.50 R$)");
        System.out.println("(3)-X-Bacon (5.00 R$)");
        System.out.println("(4)-Torrada Simples (2.00 R$)");
        System.out.println("(5)-Cachorro Quente (1.50 R$)");

        System.out.println();

        System.out.print("digite o codigo:");
        codigo = sc.nextInt();

        System.out.print("digite a quantidade:");
        quantidade = sc.nextInt();

        if (codigo == 1){
            soma = cachorro * quantidade;
            System.out.printf("preço a ser pago %.2fR$",soma);
        } else if (codigo == 2) {
            soma = xsalada * quantidade;
            System.out.printf("preço a ser pago %.2fR$",soma);
        } else if (codigo == 3) {
            soma = xbacon * quantidade;
            System.out.printf("preço a ser pago %.2fR$",soma);
        } else if (codigo == 4) {
            soma = torrada * quantidade;
            System.out.printf("preço a ser pago %.2fR$",soma);
        } else if (codigo == 5){
            soma = refri * quantidade;
            System.out.printf("preço a ser pago %.2fR$",soma);
        } else {
            System.out.print("codigo errado...");
        }


        sc.close();
    }
}