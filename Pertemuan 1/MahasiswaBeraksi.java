/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.khalidah.mahasiswaberaksi;

/**
 *
 * @author khali
 */
public class MahasiswaBeraksi {

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.membaca = "Saya sedang membaca novel";
        mahasiswa.nyontek = "Saya pernah mencontek karena tidak paham tugas yang diberikan";
        mahasiswa.modifikasi = "Saya melihat bendahara sedang memodifikasi laporan pengeluaran";
        
        System.out.println(mahasiswa.membaca);
        System.out.println(mahasiswa.nyontek);
        System.out.println(mahasiswa.modifikasi);
    }
}