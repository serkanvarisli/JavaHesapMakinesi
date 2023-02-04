import java.util.Scanner;

public class Main {
    public static void topla(double a, double b) {
        System.out.println("Toplamları: " + (a + b));
    }

    public static void cikar(double a, double b) {
        System.out.println("Çıkarma işlemi sonucu: " + (a - b));
    }

    public static void carp(double a, double b) {
        System.out.println("Çarpımları: " + (a * b));
    }

    public static void bol(double a, double b) {
        System.out.println("Bölme işlemi sonucu: " + (a / b));
    }

    public static void usalma(double a, double b) {
        System.out.println("Üs alma işlemi sonucu: " + Math.pow(a, b));
    }

    public static void karekok(double a) {
        System.out.println("Karekök alma işlemi sonucu: " + Math.sqrt(a));
    }

    public static void mod(double a, double b) {
        System.out.println("Mod alma işlemi sonucu: " + (a % b));
    }

    public static void mutlak(double a) {
        System.out.println("Karekök alma işlemi sonucu: " + Math.abs(a));
    }

    public static void main(String[] args) {
        float d, e;
        int islem;
        Scanner scanner = new Scanner(System.in);
         System.out.println("İşlem seçiniz: " +
                "1. Toplama İşlemi" +
                "2. Çıkarma işlemi" +
                "3. Çarpma işlemi" +
                "4. Bölme işlemi" +
                "5. Üs Alma işlemi" +
                "6. Karekök Alma işlemi " +
                "7. Mod değer işlemi" +
                "8. Mutlak değer alma işlemi");
        islem = scanner.nextInt();
        while (islem == 6) {
            int sayi;
            System.out.println("Sayı girin");
            sayi = scanner.nextInt();
            karekok(sayi);
            break;
        }
        while (islem == 8) {
            int sayi2;
            System.out.println("Sayı girin");
            sayi2 = scanner.nextInt();
            mutlak(sayi2);
            break;
        }
        if (islem != 6 & islem != 8) {
            System.out.println("Sayıları giriniz");
            d = scanner.nextInt();
            e = scanner.nextInt();
            switch (islem) {

                case 1:
                    topla(d, e);
                    break;
                case 2:
                    cikar(d, e);
                    break;
                case 3:
                    carp(d, e);
                    break;
                case 4:
                    bol(d, e);
                    break;
                case 5:
                    usalma(d, e);
                    break;
                case 6:
                    break;
                case 7:
                    mod(d, e);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Böyle bişey yok");
            }
        }
    }
}
