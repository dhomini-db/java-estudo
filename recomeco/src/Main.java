import java.util.Scanner;
import java.util.Locale;
public static void main (String [] args){
    Locale.setDefault(Locale.US);
    Scanner sc= new Scanner(System.in);

    String Nome;
    int idade;
    double Peso;

    System.out.print("digite seu nome:");
    Nome = sc.next();

    System.out.print("digite sua idade:");
    idade = sc.nextInt();

    System.out.print("digite seu peso:");
    Peso = sc.nextDouble();

    System.out.println();
    System.out.println("DADOS CADASTROS");
    System.out.println();
    System.out.printf("ola %s%n ",Nome);
    System.out.println("Atualmente você tem");
    System.out.printf("%.2f de peso corporal", Peso);
    System.out.printf(" e sua idade de %d anos%n", idade);
    System.out.println();
    System.out.println("PROGRAMA ENCERRADO");

    sc.close();
}