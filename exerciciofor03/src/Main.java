import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);


        int N;
        double n1,n2,n3;
        double media = 0;

        System.out.print("limite:");
        N = sc.nextInt();

        for(int i =0; i < N ;i++){


            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();

            media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

            System.out.printf("%.1f%n",media);
        }
        sc.close();
    }
}