import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    int n2,n1,op = 0;
    double soma;


   while(op !=5){

       System.out.println("(__Cauculadora__)");
       System.out.println("(_(1)-Adiçao___)");
       System.out.println("(_(2)-subtraçao_)");
       System.out.println("(_(3)-multipicaçao_)");
       System.out.println("(_(4)-divisao__)");
       System.out.println("(_(5)-sair___)");
       System.out.print("digite a opçao:");
       op= sc.nextInt();

       if (op ==1){
           System.out.println("(_(1)-Adiçao___)");
           System.out.print("digite um numero:");
           n1 = sc.nextInt();
           System.out.print("digite um numero:");
           n2 = sc.nextInt();

           soma = n1 + n2;

           System.out.printf("%d + %d = %.0f%n",n1,n2,soma);
       } else if (op == 2) {
           System.out.print("(_(2)-subtraçao_)");
           System.out.print("digite um numero:");
           n1 = sc.nextInt();
           System.out.print("digite um numero:");
           n2 = sc.nextInt();

           soma = n1 - n2;

           System.out.printf("%d - %d = %.0f%n",n1,n2,soma);

       } else if(op == 3){
           System.out.println("(_(3)-multipicaçao_)");
           System.out.print("digite um numero:");
           n1 = sc.nextInt();
           System.out.print("digite um numero:");
           n2 = sc.nextInt();

           soma = n1 * n2;

           System.out.printf("%d x %d = %.2f%n",n1,n2,soma);
       } else if(op == 4) {
           System.out.println("(_(4)-divisao__)");
           System.out.print("digite um numero:");
           n1 = sc.nextInt();
           System.out.print("digite um numero:");
           n2 = sc.nextInt();

           soma = n1/n2;

           System.out.printf("%d / %d = %.2f%n", n1, n2, soma);

       } else{
           System.out.println("programa encerrado");
           break;

       }

   }

   sc.close();
}
