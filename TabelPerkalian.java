/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPBO;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai n dari pengguna
        System.out.print("Masukkan nilai n (maksimal 10) : ");
        int n = scanner.nextInt();

        // Validasi agar n tidak lebih besar dari 10
        if (n > 10 || n < 1) {
            System.out.println("Nilai n harus antara 1 dan 10.");
        } else {
            // Mencetak header kolom
            System.out.println("\nTabel Perkalian " + n + "x" + n + ":");
            System.out.print("   \t"); // Spasi untuk sudut kiri atas tabel
            for (int i = 1; i <= n; i++) {
                System.out.print(i + "\t"); // Header kolom
            }
            System.out.println(); // Pindah ke baris berikutnya setelah header kolom

            // Mencetak tabel perkalian dengan label baris
            for (int i = 1; i <= n; i++) {
                System.out.print(i + "\t"); // Label baris di awal setiap baris
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + "\t"); // Menghitung dan mencetak hasil perkalian
                }
                System.out.println(); // Pindah ke baris berikutnya
            }
        }
        scanner.close();
    }
}

