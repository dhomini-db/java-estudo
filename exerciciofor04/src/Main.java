import java.util.Scanner;
import java.util.Locale;
public class Main{
    public static void main(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int N;
        double soma,n1,n2;

        System.out.print("Digite um limite:");
        N = sc.nextInt();

        for(int i =0;i<N;i++){
            System.out.print("digite um numero:");
            n1 = sc.nextInt();

            System.out.print("digite outro:");
            n2 = sc.nextInt();

            soma = n1 / n2;

            if (n2 == 0){
                System.out.println("divisao impossivel");
            } else{
                System.out.printf("%.1f / %.1f = %.1f%n",n1,n2,soma);
            }
        }
        sc.close();
    }
}