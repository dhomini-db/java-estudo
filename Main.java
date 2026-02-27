import java.util.Scanner;
import java.util.Locale;
public class Main{
    void main(){
        Scanner sc = new Scanner(System.in);
        double valor;

        System.out.print("digite um valor:");
        valor = sc.nextDouble();

        if(valor >= 0 && valor <=25 ){
            System.out.printf("o numero %.2f esta no intervalo de [0,25]",valor);
        }   else if(valor >= 25.00 && valor <=50 ){
            System.out.printf("o numero %.2f esta no intervalo de [25,50]",valor);
        } else if (valor >= 50.00 && valor <= 75) {
            System.out.printf("o numero %.2f esta no intervalo de [50,75]",valor);
        } else if (valor >= 75.00 && valor <= 100){
            System.out.printf("o numero %.2f esta no intervalo de [75,100]",valor);
        }   else {
            System.out.println("fora de intervalo...");
        }


    }
}