/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPBO;

/**
 *
 * @author ASUS
 */
public class Main {
    // Metode untuk menampilkan hasil volume dan luas permukaan
    public static void tampilkanHasil (BangunRuang bangunRuang) {
        System.out.println("Volume : " + bangunRuang.volume());
        System.out.println("Luas Permukaan : " + bangunRuang.luasPermukaan());
    }

    public static void main(String[] args) {
        // Contoh Balok
        System.out.println("Balok :");
        Balok balok = new Balok(5, 3, 4);
        tampilkanHasil(balok);
        
        // Contoh Kubus
        System.out.println("\nKubus :");
        Kubus kubus = new Kubus(4);
        tampilkanHasil(kubus);
    }
}
