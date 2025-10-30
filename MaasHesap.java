/*
 * Ad Soyad: Ayça Alebrahım
 * Ogrenci No: 250541614
 * Tarih: 30.10.2025
 * Aciklama: Görev 3 - Maaş Hesaplama Sistemi
 */

import java.util.Scanner;
import java.time.LocalDate;

public class MaasHesap {
    public static void main(String[] args) {
        final double SGK_ORAN = 0.14;
        final double GELIR_VERGISI = 0.15;
        final double DAMGA_VERGISI = 0.00759;

        Scanner input = new Scanner(System.in);

        System.out.println("=== MAAS HESAPLAMA SISTEMI ===");
        System.out.print("Calisan adi soyadi: ");
        String adSoyad = input.nextLine();
        System.out.print("Brut maas (TL): ");
        double brut = input.nextDouble();
        System.out.print("Haftalik calisma saati: ");
        int saat = input.nextInt();
        System.out.print("Mesai saati sayisi: ");
        int mesai = input.nextInt();

        double mesaiUcreti = (brut / 160) * mesai * 1.5;
        double toplamGelir = brut + mesaiUcreti;

        double sgk = toplamGelir * SGK_ORAN;
        double gelirVergisi = toplamGelir * GELIR_VERGISI;
        double damga = toplamGelir * DAMGA_VERGISI;
        double toplamKesinti = sgk + gelirVergisi + damga;
        double netMaas = toplamGelir - toplamKesinti;

        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNet = netMaas / (22 * (double) saat);
        double gunlukNet = netMaas / 22;

        System.out.println("\n====================================");
        System.out.println("         MAAS BORDROSI");
        System.out.println("====================================");
        System.out.printf("Calisan: %s%n", adSoyad);
        System.out.printf("Tarih: %s%n%n", LocalDate.now());

        System.out.println("GELIRLER:");
        System.out.printf("  Brut Maas              : %.2f TL%n", brut);
        System.out.printf("  Mesai Ucreti (%d saat) : %.2f TL%n", mesai, mesaiUcreti);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM GELIR           : %.2f TL%n%n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("  SGK Kesintisi (14.0%%)  : %.2f TL%n", sgk);
        System.out.printf("  Gelir Vergisi (15.0%%)  : %.2f TL%n", gelirVergisi);
        System.out.printf("  Damga Vergisi (0.8%%)   : %.2f TL%n", damga);
        System.out.println("  ------------------------");
        System.out.printf("  TOPLAM KESINTI         : %.2f TL%n%n", toplamKesinti);

        System.out.printf("NET MAAS                 : %.2f TL%n%n", netMaas);

        System.out.println("ISTATISTIKLER:");
        System.out.printf("  Kesinti Orani          : %.1f%%%n", kesintiOrani);
        System.out.printf("  Saatlik Net Kazanc     : %.2f TL/saat%n", saatlikNet);
        System.out.printf("  Gunluk Net Kazanc      : %.2f TL/gun%n", gunlukNet);
        System.out.println("====================================");

        input.close();
    }
}

