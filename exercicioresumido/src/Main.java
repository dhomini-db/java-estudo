import java.util.Scanner;
public static void main() {
    Scanner sc = new Scanner(System.in);

    double soma;
    int copias;

    System.out.print("digite a quantidade de copias:");
    copias =sc.nextInt();

    soma = (24.95 * 0.65 * copias) + 3 + ( 0.75 * (copias - 1));

    System.out.printf("valor é %.2f%n",soma);


    sc.close();


}
