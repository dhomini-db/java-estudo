import java.util.Scanner;
public static void main() {
    Scanner sc = new Scanner(System.in);

    double t1= 3.00;
    double preco = 24.95;
    int copias;
    double desconto = 0.65;
    double adicional= 0.75;
    double soma;

    System.out.print("digite a quantidade de copias:");
    copias =sc.nextInt();

    if(copias == 1){
        soma = (preco * desconto) + t1;
        System.out.printf("valor a pagar %.2f%n",soma);
    } else if (copias == 2){
        soma = ((preco * desconto) * copias) + (t1 + adicional);
        System.out.printf("valor a pagar %.2f%n",soma);
    } else{
        soma = ((preco * desconto) * copias) + (t1 + (adicional * (copias-1)) );
        System.out.printf("valor a pagar %.2f%n",soma);
    }


    sc.close();


}
