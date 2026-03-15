
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        int N = 0;
        int x;
        int c1=0;
        int c2=0;

        System.out.print("limite:");
        N = sc.nextInt();

        for(int i =0; i < N ;i++){
            System.out.print("digite um valor: ");
            x = sc.nextInt();

            if(x >=10 && x <= 20){
                c1++;
            }else{
                c2++;
            }
        }
        System.out.printf("in:%d%n",c1);
        System.out.printf("out:%d%n",c2);
        sc.close();
    }
}