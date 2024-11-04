/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg23176015.latihan24.perbandinganduanilai;

/**
 *
 * @author Asus
 * NAMA     : Natasya Adillah
 * KELAS    : PBO 06
 * NIM      : 23176015
 * DESKRIPSI PROGRAM : Program ini berisi program untuk membandingkan dua nilai 
 * yang dimasukkan
 */
import java.util.Scanner;
public class SI_RegPagi23176015Latihan24PerbandinganDuaNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;
        do {
            System.out.println("=====Program Perbandingan Nilai=====");
            System.out.print("Masukkan nilai pertama : ");
            int nilaiPertama = scanner.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            int nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil : " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            System.out.print("\nUlangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = scanner.next();

        } while (ulangi.equalsIgnoreCase("Ya"));

        System.out.println("Program selesai.");
        scanner.close();
    }
}