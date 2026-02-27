public class Main {

    public static void main (String []args){

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double a,b,c;

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de "+x+ " = " +a);
        System.out.println("Raiz quadrada de "+y+ " = " +b);
        System.out.println("Raiz quadrada de 25 = " +c);

        System.out.println();
        a = Math.pow(x,y);
        b = Math.pow(x,2.0);
        c = Math.pow(5.0,2.0);
        System.out.println(x+" ELEVADO A "+y+" é = "+a);
        System.out.println(x+" ELEVADO Ao quadrado é = "+b);
        System.out.println("5 elevado ao quadrado é = "+c);

        System.out.println();
        a = Math.abs(y);
        b = Math.abs(z);
        System.out.println("valor absoluto de "+y+" é = "+a);
        System.out.println("valor absoluto de "+z+" é = "+b);


    }
}