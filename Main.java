import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
//Küçük bir piyango oyunu tasarlayınız. Sistem iki basamaklı bir sayı üretmeli.
//Kullanıcıdan da bu sayıyı tahmin etmesini istemelisiniz.
//Eğer kullanıcı sayıyı tam olarak doğru bilirse 10000 TL;
//Eğer kullanıcı sayının basamaklarını bilirse yani 65 yerine 56 yazmıssa 5000TL
//Eğer kullanıcı şanslı numaranın sadece bir basamağını bilirse 1000 TL kazanır.
        Scanner input = new Scanner(System.in);

        System.out.println("PİYANGOYA HOŞGELDİNİZ\nSAYIYI BİL 10000 TL KAZAN\nBASAMAKLARI TUTTURURSAN 5000 TL KAZAN\nTEK BASAMAK BİLİRSEN 1000 TL KAZAN");


            int rastgele = (int)(Math.random()*99+1);
            System.out.println(rastgele);

            System.out.print("Lütfen Sayı Gir:");
            int sayi=input.nextInt();

            int rastgeleSayiBasamak1 =rastgele/10;
            int rastgeleSayiBasamak2= rastgele%10;

            int sayiBasamak1 = sayi/10;
            int sayiBasamak2 = sayi%10;

            if(sayi==rastgele){
                System.out.println("Tebrikler 10000 TL Kazandınız");
                System.out.println("Sayı:"+rastgele + " "+ "Girdiğiniz Sayı:" +sayi);
            }
            else if(rastgeleSayiBasamak1 ==sayiBasamak2 && rastgeleSayiBasamak2 ==sayiBasamak1){
                System.out.println("Tebrikler 5000 TL Kazandınız");
                System.out.println("Sayı:"+rastgele + " "+ "Girdiğiniz Sayı:" +sayi);
            }
            else if(rastgeleSayiBasamak1 ==sayiBasamak1 || rastgeleSayiBasamak1 ==sayiBasamak2 ||rastgeleSayiBasamak2 ==sayiBasamak2||rastgeleSayiBasamak2 ==sayiBasamak1){
                System.out.println("Tebrikler 1000 TL Kazandınız");
                System.out.println("Sayı:"+rastgele + " "+ "Girdiğiniz Sayı:" +sayi);
            }






















    }
}
