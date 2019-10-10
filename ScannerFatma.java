
package scannerfatma;

import java.util.Scanner;


public class ScannerFatma {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan Nama Anda ? ");
        String nama = scan.nextLine();
        System.out.println("Nama Saya Adalah : " + nama);
        
        System.out.println("Masukkan Alamat Anda ? ");
        String alamat = scan.nextLine();
        System.out.println("Alamat Saya di : " + alamat);
        
        System.out.println("Masukkan Asal Daerah Anda ? ");
        String asaldaerah = scan.nextLine();
        System.out.println("Asal Daerah Saya Adalah : " + asaldaerah);
    }
    
}
