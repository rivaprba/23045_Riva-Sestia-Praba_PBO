/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPBO;

/**
 *
 * @author ASUS
 */
public class MainLooping {
    public static void main(String[] args) {

        // a. Menghitung Deret bilangan prima dan bukan dari 0 - 20
        System.out.println("a. Deret bilangan prima dan bukan dari 0 - 20 :");
        for (int i = 0; i <= 20; i++) {
            int pembagi = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    pembagi++;
                }
            }
            if (pembagi == 2) {
                System.out.println(i + " adalah bilangan prima.");
            } else {
                System.out.println(i + " bukan bilangan prima.");
            }
        }

        // b. Menghitung Deret bilangan ganjil dan genap dari 0 - 20
        System.out.println("\nb. Deret bilangan ganjil dan genap dari 0 - 20 :");
        int num = 0;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num + " adalah bilangan genap.");
            } else {
                System.out.println(num + " adalah bilangan ganjil.");
            }
            num++;
        }

        // c. Huruf Z - A
        System.out.println("\nc. Huruf Z - A:");
        char letter = 'Z';
        do {
            System.out.print(letter + " ");
            letter--;
        } while (letter >= 'A');
        System.out.println();

        // d. Lagu "Anak Ayam Turun N"
        System.out.println("\nd. Lagu \"Anak Ayam Turun N\":");
        int anakAyam = 10; // Ganti dengan angka N yang diinginkan
        while (anakAyam > 0) {
            if (anakAyam == 1) {
                System.out.println("Anak ayam turun " + anakAyam + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + anakAyam + ", mati satu tinggal " + (anakAyam - 1) + ".");
            }
            anakAyam--;
        }
    }
}
