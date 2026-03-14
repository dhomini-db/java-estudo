import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        int rep;

        System.out.print("repetidor:");
        rep = sc.nextInt();

        for(int i=0;i<rep+1;i++){
            System.out.printf("valor de %d%n",i);
        }
        sc.close();
    }
}