/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author ASUS
 */
public class LaguBingo {
    public static void main(String[] args) {
        String bingo = "B-I-N-G-O";
        String verse = "There was a farmer who had a dog,\nAnd Bingo was his name-o.";

        for (int i = 0; i <= 5; i++) {
            System.out.println(verse);

            // Menggantikan huruf dengan tepukan tangan ("clap")
            String[] letters = bingo.split("-");
            StringBuilder clapVersion = new StringBuilder();
            for (int j = 0; j < letters.length; j++) {
                if (j < i) {
                    clapVersion.append("clap");
                } else {
                    clapVersion.append(letters[j]);
                }
                if (j < letters.length - 1) {
                    clapVersion.append("-");
                }
            }

            // Mengulangi versi dengan tepukan tangan sebanyak 3 kali
            for (int k = 0; k < 3; k++) {
                System.out.println(clapVersion.toString());
            }

            System.out.println(verse);
            System.out.println(); // Tambahkan baris kosong untuk memisahkan bait
        }
    }
}

