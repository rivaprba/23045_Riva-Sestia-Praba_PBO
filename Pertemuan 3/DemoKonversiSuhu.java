/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Suhu;

/**
 *
 * @author khali
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KonversiSuhu2 suhu = new KonversiSuhu2(20);

        suhu.celciusToFahrenheit();
        suhu.celciusToReamur();
        suhu.fahrenheitToReamur();
    }  
}
