import java.util.Scanner;
public class MatakuliahDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nomor 4
        System.out.print("Masukkan jumlah matakuliah: ");
        int jml = Integer.parseInt(sc.nextLine());
        Matakuliah02[] arrayOfMatakuliah = new Matakuliah02[jml];


        // Proses Input menggunakan method tambahData
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah02(); // Inisialisasi objek
            arrayOfMatakuliah[i].tambahData(); // Panggil method tambahData
            System.out.println("-----------------------------------------");
        }
        
        // Proses Output menggunakan method cetakInfo
        System.out.println("\n=== Data Matakuliah ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo(); // Panggil method cetakInfo
        }
    }   
}