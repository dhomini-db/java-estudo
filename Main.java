
import java.util.Scanner;
public class Main{
    void main(String [] args ){
        Scanner sc = new Scanner(System.in);

        String nome;
        System.out.print("digite seu nome heitor:");
        nome = sc.next();

        while(true){

            if(nome.equalsIgnoreCase("heitor")){
                System.out.print("parabens heitor");
            } else{
                System.out.printf("vc nao é o %s",nome);
                break;
            }
        }

        sc.close();

    }
}