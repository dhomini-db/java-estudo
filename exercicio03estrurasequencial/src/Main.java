import java.sql.SQLOutput;
import java.util.Scanner;
public static void main (String []args){
    Scanner sc = new Scanner(System.in);

    int A,B,C,D,dif;

    System.out.print("digite o primeiro numero:");
    A= sc.nextInt();

    System.out.print("digite o segundo numero:");
    B= sc.nextInt();

    System.out.print("digite o terceiro numero:");
    C= sc.nextInt();

    System.out.print("digite o quarto numero:");
    D= sc.nextInt();

    dif = A*B - C*D;

    System.out.printf("a diferença de %d x %d - %d x %d = %d%n ",A,B,C,D,dif);





    sc.close();
}