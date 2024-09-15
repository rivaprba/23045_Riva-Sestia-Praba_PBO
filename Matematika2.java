/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author ASUS
 */
public class Matematika2 extends Matematika {
    int modulus;
    
    public void modulus (int a, int b){
        this.a = a;
        this.b = b;
        modulus = this.a % this.b;
        
        System.out.println("Modulus\t\t\t : " + this.a + " % " + this.b + "\t= " + modulus);
    }
}

