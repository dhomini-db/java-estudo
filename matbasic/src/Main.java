import java.util.Scanner;
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    double n1;
    double n2;
    double n3;
    double A,B,C;

    System.out.print("digite o primeiro numero: ");
    n1 = sc.nextDouble();

    System.out.print("digite o segundo numero: ");
    n2 = sc.nextDouble();

    System.out.print("digite o terceiro numero: ");
    n3 = sc.nextDouble();

    System.out.println();

    A = Math.sqrt(n1);
    B = Math.sqrt(n2);
    C = Math.sqrt(n3);
    System.out.printf("a raiz quadrada de %.1f é = %.1f%n",n1,A);
    System.out.printf("a raiz quadrada de %.1f é = %.1f%n",n2,B);
    System.out.printf("a raiz quadrada de %.1f é = %.1f%n",n3,C);

    System.out.println("--------------------------------------");

    A = Math.pow(n1,n2);
    B = Math.pow(n1,2);
    C = Math.pow(n2,2);
    System.out.printf("%.1f elevado a %.1f = %.1f%n",n1,n2,A);
    System.out.printf("%.1f elevado ao quadrado = %.1f%n",n1,B);
    System.out.printf("%.1f elevado ao quadrado = %.1f%n",n2,C);

    System.out.println("--------------------------------------");


    A = Math.abs(n1);
    B = Math.abs(n2);
    C = Math.abs(n3);
    System.out.printf("valor absoluto de %.1f é = %.1f%n",n1,A);
    System.out.printf("valor absoluto de %.1f é = %.1f%n",n2,B);
    System.out.printf("valor absoluto de %.1f é = %.1f%n",n3,C);

    System.out.println("--------------------------------------");





    sc.close();
}