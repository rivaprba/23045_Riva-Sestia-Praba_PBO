/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Suhu;

/**
 *
 * @author khali
 */
public class KonversiSuhu2 extends KonversiSuhu {
    public KonversiSuhu2(double suhu) {
        super(suhu);
    }

    public void fahrenheitToReamur() {
        System.out.println(suhu + " Fahrenheit\t\t= " + ((4 * (suhu - 32) / 9)) + " R");
    }
}
