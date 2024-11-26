
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author ASUS
 */
public class Matematika implements InterfaceMatematika {
    public int tambah;
    public int kurang;
    public int kali;
    public int bagi;
    int a, b;
    
    
    public void pertambahan (int a, int b){
        this.a = a;
        this.b = b;
        tambah = this.a + this.b;
        
        System.out.println("Pertambahan\t\t : " + this.a + " + " + this.b + "\t= " + tambah);
    }
    
    
    public void pengurangan (int a, int b){
        this.a = a;
        this.b = b;
        kurang = this.a - this.b;
        
        System.out.println("Pengurangan\t\t : " + this.a + " - " + this.b + "\t= " + kurang);
    }
    
    
    public void perkalian (int a, int b){
        this.a = a;
        this.b = b;
        kali = this.a * this.b;
        
        System.out.println("Perkalian\t\t : " + this.a + " * " + this.b + "\t= " + kali);
    }
    
    
    public void pembagian (int a, int b){
        this.a = a;
        this.b = b;
        bagi = this.a / this.b;
        
        System.out.println("Pembagian\t\t : " + this.a + " / " + this.b + "\t= " + bagi);
    }
}
