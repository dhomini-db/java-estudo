import java.util.Scanner;
import java.util.Locale;
public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int Nf,H ;
    double Vh,Sa;

    System.out.print("digite o numero do funcionario:");
    Nf =sc.nextInt();

    System.out.print("digite sua carga horaria:");
    H =sc.nextInt();

    System.out.print("digite o valor recebido por hora trabalhada:");
    Vh =sc.nextDouble();
    System.out.println();
    Sa = Vh * H;

    System.out.printf("FUNCIONARIO:%d%nSALARIO:%.2f",Nf,Sa);
    System.out.println();








































    sc.close();
}