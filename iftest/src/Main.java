import java.util.Scanner;
public class Main{
    void main(){
        Scanner sc = new Scanner(System.in);
         int n1,n2;

        System.out.print("digite um numero:");
        n1 = sc.nextInt();

        System.out.print("digite um numero:");
        n2 = sc.nextInt();

        if (n1 % n2 == 0 || n2 % n1 == 0){
            System.out.printf("os numero %d e %d sao multiplos",n1,n2);
        }   else {
            System.out.printf("os numero %d e %d nao sao multiplos",n1,n2);
        }

























        sc.close();

    }
}