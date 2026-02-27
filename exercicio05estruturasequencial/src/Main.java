import java.util.Scanner;
import java.util.Locale;
public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int C1, N1, C2, N2;
    double V1, V2, Soma;

    System.out.print("digite o codigo da peça (1):");
    C1 = sc.nextInt();

    System.out.print("digite o numero de peça(s) (1):");
    N1 = sc.nextInt();

    System.out.print("digite o valor da peça:");
    V1 = sc.nextDouble();
    System.out.println();
    System.out.print("digite o codigo da peça (2):");
    C2 = sc.nextInt();

    System.out.print("digite o numero de peça(s) (2):");
    N2 = sc.nextInt();

    System.out.print("digite o valor da peça:");
    V2 = sc.nextDouble();

    Soma = (N1 * V1) + (N2 * V2);
    System.out.println();
    System.out.printf("a peça de codigo (%d) que custa (%.2fR$)%nsomado com a peça (%d) custando (%.2fR$) é = (%.2fR$)", C1, V1, C2, V2, Soma);
    System.out.println();
}