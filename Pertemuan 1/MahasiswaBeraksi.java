
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class MahasiswaBeraksi {
    
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.membaca = "Mahasiswa itu sedang membaca materi perkuliahan";
        mahasiswa.nyontek = "Mahasiswa terkadang menyontek karena tidak paham materinya";
        mahasiswa.modifikasi = "Mahasiswa juga kadang memodifikasi tugasnya";
        
        System.out.println(mahasiswa.membaca);
        System.out.println(mahasiswa.nyontek);
        System.out.println(mahasiswa.modifikasi);
    }
}

