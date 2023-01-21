package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class DaireDilimiAlan {
    public static void main(String[] args) {
        /*
        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

                Formül : (𝜋 * (r*r) * 𝛼) / 360
        */
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap giriniz : ");
        double r = input.nextDouble();

        System.out.print("Merkez açı ölçüsünü giriniz : ");
        double 𝛼 = input.nextDouble();

        double pi =3.14 , alan = (pi*(r*r*𝛼))/360.0;


        String str = 𝛼 <= 360 ? "Alan = " + alan : "\nMerkez açı ölçüsü 0 - 360 derece arasında olmalıdır.";
        System.out.println(str);


    }
}
