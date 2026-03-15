import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = 0;

        System.out.print("Digite um valor:");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            if ( N % i == 0){
                System.out.println(i);
            }else{
                System.out.println("nao");
            }
        }

    }
}

/// estrutura else utilizida para entender
///a logica utilizada no programa
