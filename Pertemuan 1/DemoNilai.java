/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class DemoNilai {
    
    public static void main(String[] args) {
     Nilai mahasiswa = new Nilai();
     
     mahasiswa.npm = "2310631170045";
     mahasiswa.nama = "Riva Sestia Praba";
     mahasiswa.NilaiAbsen = 100;
     mahasiswa.NilaiTugas = 90;
     mahasiswa.NilaiUTS = 85;
     mahasiswa.NilaiUAS = 90;
     
     mahasiswa.Nilai();
     mahasiswa.CetakNilai();
    }
}

