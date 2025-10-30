/*
 * Ad Soyad: Ayça Alebrahim
 * Ogrenci No: 250541614
 * Tarih: 30.10.2025
 * Aciklama: Görev 2 - Geometrik Hesaplayıcı
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        double r = input.nextDouble();

        double alan = PI * Math.pow(r, 2);
        double cevre = 2 * PI * r;
        double cap = 2 * r;
        double kureHacmi = (4.0 / 3) * PI * Math.pow(r, 3);
        double kureYuzey = 4 * PI * Math.pow(r, 2);

        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani        : %.2f cm²%n", alan);
        System.out.printf("Daire Cevresi      : %.2f cm%n", cevre);
        System.out.printf("Daire Capi         : %.2f cm%n", cap);
        System.out.printf("Kure Hacmi         : %.2f cm³%n", kureHacmi);
        System.out.printf("Kure Yuzey Alani   : %.2f cm²%n", kureYuzey);

        input.close();
    }
}

