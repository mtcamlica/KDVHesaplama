import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kullaniciTutar;
        double kdvliKullaiciTutar;
        double kdvTutar;
        double kdvOran;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen tutar giriniz: ");
        kullaniciTutar = input.nextDouble();

        if (kullaniciTutar < 1000)
            kdvOran = 1.18;
        else
            kdvOran = 1.08;
        kdvliKullaiciTutar = kullaniciTutar * kdvOran;
        kdvTutar = (kullaniciTutar * kdvOran) - kullaniciTutar;

        System.out.println("KDV'siz Fiyat: " + kullaniciTutar);
        System.out.println("KDV'li Fiyat: " + kdvliKullaiciTutar);
        System.out.println("KDV Tutarı: " + kdvTutar);

        }
    }
