import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int Hi,Hf,soma;

        System.out.print("que hrs o jogo iniciou?:");
        Hi = sc.nextInt();

        System.out.print("que hrs o jogo acabou?:");
        Hf = sc.nextInt();
        if (Hi<Hf){
            soma = Hf-Hi ;
        }
        else{
            soma = 24 - Hi+Hf;

        }

        System.out.printf("o jogo durou %d horas",soma);





















        sc.close();
    }
}