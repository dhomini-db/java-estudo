import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = 0;
        int fat = 1;

        System.out.print("Digite um valor:");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            fat = fat * i;
            System.out.println(fat);

        }

    }
}