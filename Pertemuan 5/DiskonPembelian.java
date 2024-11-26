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
public class DiskonPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input total pembelian
        System.out.print("Masukkan total pembelian : Rp. ");
        double totalPembelian = input.nextDouble();
        
        double potongan = 0;
        
        // Menentukan besarnya potongan berdasarkan kriteria
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;
        } else {
            potongan = totalPembelian * 0.20;
        }
        
        // Menghitung jumlah yang harus dibayarkan
        double totalBayar = totalPembelian - potongan;
        
        // Output hasil
        System.out.println("Total pembelian Rp. " + totalPembelian);
        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + totalBayar);
    }
}
