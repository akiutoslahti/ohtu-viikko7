package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            tulostaAlkuOhje();
            String vastaus = scanner.nextLine().trim();
            char valinta = vastaus.charAt(0);
            if (valinta >= 'a' && valinta <= 'c') {
                KPS kps = null;
                switch (valinta) {
                    case 'a':
                        kps = KPSRakentaja.luoKaksinPeli();
                        break;
                    case 'b':
                        kps = KPSRakentaja.luoYksinPeli();
                        break;
                    case 'c':
                        kps = KPSRakentaja.luoPahaYksinPeli();
                        break;
                    default:
                        break;
                }
                if (kps != null) {
                    kps.pelaa();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
    }

    public static void tulostaAlkuOhje() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }

    public static void tulostaPeliOhje() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
    }
}
