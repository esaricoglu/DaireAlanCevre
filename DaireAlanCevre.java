package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        double r = input.nextDouble();
        double pi = 3.14;

        double cevre = 2*pi*r;
        System.out.println("Dairenizin çevresi = " + cevre);

        double alan =  pi*r*r;
        System.out.println("Dairenizin alanı = " + alan );







    }
}
