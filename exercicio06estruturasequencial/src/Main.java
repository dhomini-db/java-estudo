import java.util.Scanner;
import java.util.Locale;
public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    double A,B,C,Atriangulo,Acirculo,Atrapezio,Aquadrado,Aretangulo;

    System.out.print("digite a primeira medida:");
    A = sc.nextDouble();

    System.out.print("digite a segunda medida:");
    B = sc.nextDouble();

    System.out.print("digite a terceira medida:");
    C = sc.nextDouble();
    System.out.println();
    Atriangulo = (A*C)/2;
    Acirculo = 3.14159 * Math.pow(C,2);
    Atrapezio = (A+B)*C/2;
    Aquadrado = Math.pow(B,2);
    Aretangulo = A*B;

    System.out.printf("a area do triangulo retangulo (%.1f x %.1f /2) = (%.3f)%n",A,C,Atriangulo);
    System.out.printf("a area do circulo (pi*%.1f) = (%.3f)%n",C,Acirculo);
    System.out.printf("a area do trapézio (%.1f + %.1f) x %.1f / 2) = (%.3f)%n",A,B,C,Atrapezio);
    System.out.printf("a area do quadrado (%.1f x %.1f) = (%.3f)%n",A,A,Aquadrado);
    System.out.printf("a area do retangulo (%.1f x %.1f) = (%.3f)%n",A,B,Aretangulo);









































    sc.close();
}