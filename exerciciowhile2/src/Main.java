import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.print("digite um valor para x:");
        x = sc.nextInt();
        System.out.print("digite um valor para y:");
        y = sc.nextInt();

        while( x != 0 && y != 0 ){
            if(x > 0 && y > 0){
                System.out.println();
                System.out.printf("%d e %d  PRIMEIRO quadrante%n",x,y);
                System.out.println();
            } else if(x< 0 && y > 0){
                System.out.println();
                System.out.printf("%d e %d SEGUNDO quadrante%n",x,y);
                System.out.println();
            }else if (x < 0 && y < 0){
                System.out.println();
                System.out.printf("%d e %d TERCEIRO quadrante%n",x,y);
                System.out.println();
            }else if (x < 0 && y>0){
                System.out.println();
                System.out.printf("%d e %d QUARTO quadrante%n",x,y);
                System.out.println();
            } else{
                System.out.println();
            }
                System.out.print("digite um valor para x:");
                x = sc.nextInt();
                System.out.print("digite um valor para y:");
                y = sc.nextInt();
        }
    }
}