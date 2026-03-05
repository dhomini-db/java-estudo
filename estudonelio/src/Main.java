import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int anos;
        String idade;

        System.out.print("digite sua idade:");
        anos = sc.nextInt();

        idade = (anos < 18) ? "de menor": "de maior";

        System.out.printf("%s",idade);


    }
}