import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int hinicial, hfinal,dif;

        System.out.print("digite a hora em q começou:");
        hinicial = sc.nextInt();

        System.out.print("digite a hora em q parou:");
        hfinal = sc.nextInt();

        if (hinicial < hfinal){
            dif = hfinal - hinicial;
            System.out.printf("a duraçao foi de %d hora(s) ",dif);
        }
        else{
            dif = 24 - hinicial + hfinal;
            System.out.printf("a duraçao foi de %d hora(s)",dif);
        }













        sc.close();
    }
}