
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPBO;

/**
 *
 * @author ASUS
 */
public class Balok extends BangunRuang {

    private final double panjang;
    private final double lebar;
    private final double tinggi;
    
    // Constructor untuk Balok
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }
    
    // Mengoverride metode luasPermukaan
    @Override
    public double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

