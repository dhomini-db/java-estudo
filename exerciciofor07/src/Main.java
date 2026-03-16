import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int N,i2,i3;


        System.out.print("digite um valor:");
        N = sc.nextInt();

        for(int i = 1;i<=N;i++){

            i2 = i*i;
            i3 = i*i*i;

            System.out.printf("%d %d %d%n",i,i2,i3);
        }

        sc.close();
    }
}