//nao consegui fazer sem ajuda, pq nao sabia as formulas.
//OBS: tinha colocado variaveis demais.
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,C,triangulo,trapezio,circulo,quadrado,retangulo,pi = 3.14159;


        System.out.print("Digite o primeiro numero: ");
        A = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        B = sc.nextDouble();

        System.out.print("Digite o terceiro numero :");
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = pi * Math.pow(C,2.0);
        trapezio = (A + B )  * C / 2.0;
        quadrado = B * B;
        retangulo = A * B;

        System.out.println();

        System.out.printf("area do triangulo: %.3f%n",triangulo);
        System.out.printf("area do circulo: %.3f%n",circulo);
        System.out.printf("area do trapezio: %.3f%n",trapezio);
        System.out.printf("area do quadrado: %.3f%n",quadrado);
        System.out.printf("area do retangulo: %.3f%n",retangulo);

    }
}