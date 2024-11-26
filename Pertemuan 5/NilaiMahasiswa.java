
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
public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("NPM : ");
        String npm = scanner.nextLine();
        
        System.out.print("Nama Mahasiswa : ");
        String namaMahasiswa = scanner.nextLine();
        
        System.out.print("Nilai Kehadiran : ");
        double nilaiKehadiran = scanner.nextDouble();
        
        System.out.print("Nilai Tugas : ");
        double nilaiTugas = scanner.nextDouble();
        
        System.out.print("Nilai UTS : ");
        double nilaiUTS = scanner.nextDouble();
        
        System.out.print("Nilai UAS : ");
        double nilaiUAS = scanner.nextDouble();

        // Hitung nilai akhir
        double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        
        // Tentukan grade dan keterangan
        String grade;
        String keterangan;
        
        if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            grade = "E";
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else {
            grade = "N/A";
            keterangan = "Nilai tidak valid";
        }

        // Tampilkan output
        System.out.println("\nTampilan Output");
        System.out.println("NPM Mahasiswa : " + npm);
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.printf("Nilai Rata-rata : %.2f\n", nilaiAkhir);
        System.out.println("Grade : " + grade);
        System.out.println("Keterangan : " + keterangan);

        scanner.close();
    }
}
