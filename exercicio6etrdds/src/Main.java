import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1,n1,cod2,n2;
        double v1,v2,vt;

        System.out.print("digite o codigo da primeira peça : ");
        cod1 = sc.nextInt();

        System.out.print("digite o numero de peças: ");
        n1 =  sc.nextInt();

        System.out.print("digite o valor unitario: ");
        v1 = sc.nextDouble();
        System.out.println();
        System.out.print("digite o codigo da segunda peça : ");
        cod2 = sc.nextInt();

        System.out.print("digite o numero de peças: ");
        n2 =  sc.nextInt();

        System.out.print("digite o valor unitario: ");
        v2 = sc.nextDouble();

        vt = n1 * v1 + n2 * v2;

        System.out.printf("o valor total a pagar sera: %.2f%n",vt);
    }
}