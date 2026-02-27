import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


       int n1;

        System.out.print("digite um numero:");
        n1 = sc.nextInt();

        if (n1<=25 && n1 >= 0 ){
            System.out.printf("%n%d esta entre (0 a 25) da lista",n1);
        }

        else if (n1>=26 && n1 <=50) {
            System.out.printf("%n%d esta entre (26 a 50) da lista ",n1);
        }

        else if (n1>=51 && n1 <=75) {
            System.out.printf("%n%d esta entre (51 a 75) da lista ",n1);
        }

        else {
            System.out.print(n1>=76 && n1 <=100);
            System.out.printf("%n%d esta entre (76 a 100) da lista ",n1);
        }

        sc.close();
    }
}