package pboif2.pkg10119065.latihan27.latihanhurufbesarkecil;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan huruf besar kecil
 */
public class PBOIF210119065Latihan27LatihanHurufBesarKecil {

    public static String kBesar(String kalimat){
        String string = kalimat.toUpperCase();
        return string;
    }
    public static String kKecil(String kalimat){
        String string = kalimat.toLowerCase();
        return string;
    }
    public static String convertKalimat(String kalimat){
        
        String convert = "=== Hasil Formatting ===\n" + 
                         "Huruf Besar : "+ kBesar(kalimat) +
                         "\nHuruf Kecil : " + kKecil(kalimat);
        return convert;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       System.out.print("Masukkan Kalimat : ");
       String kalimat = sc.nextLine();
       
       System.out.println(convertKalimat(kalimat));
       System.out.println("(Developed by : Fachriansyah Muhammad Nur Ihsan)");  
    }
    
}
