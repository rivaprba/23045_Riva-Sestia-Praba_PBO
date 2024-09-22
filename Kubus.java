/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPBO;

/**
 *
 * @author ASUS
 */
public class Kubus extends BangunRuang {
    private final double sisi;
    
    // Constructor untuk Kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    // Mengoverride metode volume
    @Override
    public double volume() {
        return sisi * sisi * sisi;
    }
    
    // Mengoverride metode luasPermukaan
    @Override
    public double luasPermukaan() {
        return 6 * (sisi * sisi);
    }
}
