import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        int A,B;

        System.out.print("digite um numero:");
        A= sc.nextInt();
        System.out.print("digite outro numero:");
        B= sc.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.printf("%d e %d sao mutiplos",A,B);
        }
        else{
            System.out.printf("%d e %d nao sao mutiplos",A,B);
        }































        sc.close();
    }
}