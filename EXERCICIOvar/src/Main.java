import java.util.Locale;

public class Main {

    public static void main(String[]args) {
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 4402;
        char gender = 'f';

        double price1 =2100.0;
        double price2 =650.0;
        double measure = 52.932234;

        System.out.println("Products:");
        System.out.printf("%s, which price is %.2fR$ %n",product1,price1);
        System.out.printf("%s, which price is %.2fR$ %n",product2,price2);
        System.out.println();
        System.out.printf("Record: %d years old,code %d and gender %c %n",age,code,gender);
        System.out.println();
        System.out.printf("Measure with eight decimal places:  %.8f %n",measure);
        System.out.printf("Measure with three decimal places:  %.3f %n",measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point:  %.3f %n",measure);


    }

}