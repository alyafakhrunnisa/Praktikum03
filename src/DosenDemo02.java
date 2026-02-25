import java.util.Scanner;

public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen02[] arrayOfDosen = new Dosen02[3];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            String kode = sc.nextLine();

            System.out.print("Nama           : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin  : ");
            Boolean jenisKelamin = sc.nextLine().equalsIgnoreCase("Pria");
            
            System.out.print("Usia           : ");
            int usia = Integer.parseInt(sc.nextLine());
            arrayOfDosen[i] = new Dosen02(kode, nama, jenisKelamin, usia);
            System.out.println("-----------------------------------------");
        }

        DataDosen02 dataDosen = new DataDosen02();

        System.out.println("\n=== Data Dosen ===");
        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
