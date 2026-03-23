import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int soma,n1,n2,op=0;

        while(op != 5) {

            menu();
            op = sc.nextInt();

            if (op == 1){
                System.out.println("-adição-");
                System.out.println("----------");
                numeros();
                System.out.print(":");
                n1 = sc.nextInt();
                System.out.println("+");
                System.out.print(":");
                n2 = sc.nextInt();
                soma = n1 + n2;
                System.out.printf("%d + %d = %d%n",n1,n2,soma);
            }

            else if (op == 2){
                int op2 = 0;

                while(op2 != 4) {
                    menuMult();
                    op2 = sc.nextInt();
                    if (op2 == 1) {
                        int x;
                        System.out.print("tabuada de x numero:");
                        x = sc.nextInt();
                        tab(x);

                    } else if (op2 == 2) {
                        numeros();
                        System.out.print(":");
                        n1 = sc.nextInt();
                        System.out.println("x");
                        System.out.print(":");
                        n2 = sc.nextInt();
                        soma = n1 * n2;
                        System.out.printf("%d x %d = %d%n", n1, n2, soma);
                    } else if (op2 == 3) {
                        double e;
                        numeros();
                        System.out.print(":");
                        n1 = sc.nextInt();
                        System.out.print(":");
                        n2 = sc.nextInt();
                        e = Math.pow(n1, n2);
                        System.out.printf("%d^%d = %.1f%n", n1, n2, e);
                    } else {
                        invalido();
                    }
                }
            }

            else if(op == 3){
                System.out.println("-subtraçao-");
                System.out.println("----------");
                numeros();
                System.out.print(":");
                n1 = sc.nextInt();
                System.out.println("-");
                System.out.print(":");
                n2 = sc.nextInt();
                soma = n1 - n2;
                System.out.printf("%d - %d = %d%n",n1,n2,soma);
            }
            else if(op == 4){
                int op3 = 0;
                while (op3 != 5) {
                    menuDiv();
                    op3 = sc.nextInt();

                    if (op3 == 1) {
                        numeros();
                        System.out.print(":");
                        double n3 = sc.nextDouble();
                        System.out.println("/");
                        System.out.print(":");
                        double n4 = sc.nextDouble();
                        double div = n3 / n4;
                        System.out.printf("%.1f / %.1f   = %.1f%n", n3, n4, div);
                    }
                    else if (op3 == 2){
                        double div,porcent,num2;
                        numeros();
                        System.out.print(":");
                        porcent = sc.nextDouble();
                        System.out.print(":");
                        num2 = sc.nextDouble();
                        div = (porcent / 100) * num2;
                        System.out.printf("%.0f * %.1f   = %.1f%n",porcent,num2,div);
                    }
                    else if (op3 == 3) {
                        int P;
                        numeros();
                        P = sc.nextInt();
                        div(P);
                    }
                    else if (op3 == 4){
                        numeros();
                        System.out.print(":");
                        double x = sc.nextDouble();
                        System.out.println(Math.sqrt(x));
                    }
                    else{
                        invalido();
                    }
                }
            }
            else {
                invalido();
            }
        }
        sc.close();
    }







    //submenu multiplicaçao tabuda de x numero
    public static void tab(int num ){
        int soma;
        System.out.printf("tabuada de %d%n",num);
        for (int i = 1;i <=10;i++){
            soma = num * i;
            System.out.printf("%d x %d = %d%n",num,i,soma);
        }
    }
    public static void div(int N) {
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d é par%n",i);
            } else {
                System.out.printf("%d é impar%n",i);
            }
        }
    }
    public static void numeros(){
        System.out.println("(- - 9 8)");
        System.out.println("(7 6 5 4)");
        System.out.println("(3 2 1 0)");

    }
    public static void menuMult(){
        System.out.println("-multiplicaçao-");
        System.out.println("---------------");
        System.out.println("-tabuada de x numero-(1)-");
        System.out.println("-numero x numero-(2)-");
        System.out.println("-elevado-(3)-");
        System.out.println("--sair-(4)-");
        System.out.print("digite sua opçao:");
    }

    public static void menuDiv(){
        System.out.println("-DIVISAO-");
        System.out.println("---------------");
        System.out.println("-numero / numero-(1)-");
        System.out.println("-porcentagem-(2)-");
        System.out.println("-impar ou par-(3)-");
        System.out.println("-raiz quadrada-(4)-");
        System.out.println("----sair-(5)---");
        System.out.print("digite sua opçao:");
    }
    public static void menu(){
        System.out.println("Calculadora 2.0");
        System.out.println("----------------");
        System.out.println("----adição-(1)---");
        System.out.println("---multiplicaçao-(2)");
        System.out.println("---subtraçao-(3)--");
        System.out.println("----divisao-(4)---");
        System.out.println("----sair(5)------");
        System.out.println("----------------");
        System.out.print("digite sua opçao:");
    }

    public static void invalido(){

        System.out.println("---------");
        System.out.println("invalido");
        System.out.println("---------");

    }
}

