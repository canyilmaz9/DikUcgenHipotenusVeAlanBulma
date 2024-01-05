import java.util.Scanner;

import static java.lang.Math.sqrt;

public class DikUcgenHipotenusVeAlanBulma {

    public static void main(String[] args){

        //Değişkenler tanımlandı.
        double dikkenar1, dikkenar2, hipotenus;

        //Dik kenarları kullancıdan aldık.
        Scanner input = new Scanner(System.in);
        System.out.print("İlk dik kenarı giriniz: ");
        dikkenar1 = input.nextDouble();

        System.out.print("İkinci dik kenarı giriniz: ");
        dikkenar2 = input.nextDouble();

        //Hipotenüs hesaplama
        hipotenus =  sqrt((dikkenar1*dikkenar1)  + (dikkenar2*dikkenar2));
        System.out.println("Hipotenüs: " + hipotenus);
        //----------------------------------------------------------------
        //Üçgen Çevre Hesaplama:

        double a, b, c, u, alan;
        System.out.print("İlk kenarı giriniz: ");
        a = input.nextDouble();

        System.out.print("İkinci kenarı giriniz: ");
        b = input.nextDouble();

        System.out.print("Üçüncü kenarı giriniz: ");
        c = input.nextDouble();

        u = (a+b+c)/2;
        alan = sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgen Alanı: " + u);


    }
}
