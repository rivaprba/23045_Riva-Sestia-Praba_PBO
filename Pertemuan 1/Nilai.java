/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.khalidah.demonilai;

/**
 *
 * @author khali
 */
public class Nilai {
  public String nama, npm;
  public double NilaiAbsen, NilaiTugas, NilaiUTS, NilaiUAS, NilaiAkhir;
  
  public void Nilai(){
      NilaiAkhir = (0.10 * NilaiAbsen + 0.20 * NilaiTugas + 0.30 * NilaiUTS + 0.40 * NilaiUAS);
  }
  
  public void CetakNilai(){
      System.out.println("NPM\t\t: " + npm);
      System.out.println("Nama\t\t: " + nama);
      System.out.println("\nNilai Absen\t: " + NilaiAbsen);
      System.out.println("Nilai Tugas\t: " + NilaiTugas);
      System.out.println("Nilai UTS\t: " + NilaiUTS);
      System.out.println("Nilai UAS\t: " + NilaiUAS);
      System.out.println("Nilai Akhir\t: " + NilaiAkhir);
  }
}