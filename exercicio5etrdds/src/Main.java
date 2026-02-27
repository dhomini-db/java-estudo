import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int nu,hrs;
        double sal,cont;

        System.out.print("digite seu numero:");
        nu= sc.nextInt();

        System.out.print("digite sua carga horaria:");
        hrs = sc.nextInt();

        System.out.print("digite o valor por hora trabalhada:");
        sal = sc.nextDouble();

        System.out.printf("funcionario numero %d%n",nu);

        cont = sal*hrs;

        System.out.printf("seu salario mensal é: %.2f%n ",cont);



    }
}