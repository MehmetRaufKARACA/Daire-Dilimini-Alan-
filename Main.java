import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        // Değişkenleri tanımla
        int r;
        double pi = 3.14;
        double 𝛼 ;

        //Scanner sınıfnı tanımla
        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = inp.nextInt();
        System.out.print("Merkez açısının ölçüsnü giriniz : ");
        𝛼 = inp.nextInt();

        // Dairenin alanını hesapla
        double alan = (pi * (r * r) * 𝛼 ) / 360; 
        
        // Alanı ekrana yazdır
        System.out.print("Dairenin alanı = " + alan);

    }
}