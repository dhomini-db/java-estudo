import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("digite tres numeros: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        int higher = max(a,b,c);
        mostraResultado(higher);
        sc.close();
    }
    public static int max(int x,int y,int z){
        int resultado;
        if(x>y && x>z){
            resultado = x;
        }

        else if (y>z){
            resultado = y;
        }

        else {
            resultado= z;
        }
        return resultado;
    }

    public static void mostraResultado(int valor){
        System.out.printf("maior é %d",valor);

    }
}