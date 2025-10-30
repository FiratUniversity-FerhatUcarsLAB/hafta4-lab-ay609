/*
 * Ad Soyad: [ADINIZI BURAYA YAZIN]
 * Ogrenci No: [OGRENCI NUMARANIZI BURAYA YAZIN]
 * Tarih: [TARIHI BURAYA YAZIN]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        // Scanner objesi olusturun
        
        
        // Degisken tanimlamalari
        // String ad, soyad;
        // int ogrenciNo, yas;
        // double gpa;
        
        
        // Kullanicidan bilgileri alin
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.println();
        
        // Ad
        
        
        // Soyad
        
        
        // Ogrenci No
        
        
        // Yas
        
        
        // GPA
        
        
        // Bilgileri ekrana yazdirin
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // COZUMUNUZU BURAYA YAZIN

        ,
        
        /*
 * Ad Soyad: Ayça Alebrahim
 * Ogrenci No: 250541614
 * Tarih: 30.10.2025
 * Aciklama: Görev 1 - Öğrenci Bilgi Sistemi
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.print("Ad: ");
        String ad = input.nextLine();
        System.out.print("Soyad: ");
        String soyad = input.nextLine();
        System.out.print("Ogrenci No: ");
        int no = input.nextInt();
        System.out.print("Yas: ");
        int yas = input.nextInt();
        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", no);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);
        System.out.println("Durum: " + (gpa >= 2.0 ? "Basarili Ogrenci" : "Gelistirilebilir"));

        input.close();
    }
}

        
        
        

        
        
        // Scanner'i kapatin (önemli pratik)
        
    }
}
