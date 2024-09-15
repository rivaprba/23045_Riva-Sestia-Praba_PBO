/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author ASUS
 */
public class KonversiSuhu {
    public double suhu;

    public KonversiSuhu(double suhu) {
        this.suhu = suhu;
    }

    public void celciusToFahrenheit() {
        System.out.println(this.suhu + " Celcius\t\t= " + ((9 * this.suhu / 5) + 32) + " F");
    }

    public void celciusToReamur() {
        System.out.println(this.suhu + " Celcius\t\t= " + ((4 * this.suhu / 5)) + " R");
    }
}

