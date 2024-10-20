/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPBO;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class TokoSerbaAda {    
    // Method to get the name and price of the item based on the code
    public static String[] getItemDetails(String kodeBarang) {
        String[] details = new String[2];

        switch (kodeBarang) {
            case "a001":
                details[0] = "Buku";    // Name
                details[1] = "3000";    // Price
                break;
            case "a002":
                details[0] = "Pensil";
                details[1] = "4000";
                break;
            case "a003":
                details[0] = "Pulpen";
                details[1] = "5000";
                break;
            default:
                details[0] = "Unknown"; // Default for invalid codes
                details[1] = "0";       // Set price to 0 for invalid codes
                break;
        }

        return details;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA");
        System.out.println("****************");

        // Input: Number of items
        System.out.print("Masukkan Jumlah Item Barang: ");
        int itemCount = scanner.nextInt();

        // Arrays to store the details
        String[] kodeBarang = new String[itemCount];
        int[] jumlahBeli = new int[itemCount];
        String[][] namaHarga = new String[itemCount][2];

        // Input data for each item
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode Barang: ");
            kodeBarang[i] = scanner.next();

            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = scanner.nextInt();

            // Get the item details based on the code
            namaHarga[i] = getItemDetails(kodeBarang[i]);
        }

        // Output: Display the purchase table
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("*****************************");
        System.out.printf("%-4s %-12s %-12s %-8s %-10s %-12s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("------------------------------------------------------------");

        int totalBayar = 0; // To calculate total payment

        // Display each item
        for (int i = 0; i < itemCount; i++) {
            int harga = Integer.parseInt(namaHarga[i][1]); // Convert price to integer
            int jumlahBayar = harga * jumlahBeli[i]; // Calculate the payment per item
            totalBayar += jumlahBayar; // Add to total payment

            System.out.printf("%-4d %-12s %-12s %-8d %-10d %-12d\n", (i + 1), kodeBarang[i], namaHarga[i][0], harga, jumlahBeli[i], jumlahBayar);
        }

        // Display total payment
        System.out.println("------------------------------------------------------------");
        System.out.println("Total Bayar: " + totalBayar);

        scanner.close(); // Close scanner resource
    }
}

    
    
