public class DataDosen02 {
    public void dataSemuaDosen(Dosen02[] arrayOfDosen) {
        int i = 1;
        for (Dosen02 dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i);
            tampilkan(dosen);
    }
}
    public void jumlahDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria: " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jumlahPria = 0;
        int jumlahWanita = 0;

        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria: " + (jumlahPria > 0 ? (double) totalUsiaPria / jumlahPria : 0));
        System.out.println("Rata-rata Usia Dosen Wanita: " + (jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0));
    }

    public void infoDosenPalingTua(Dosen02[] arrayOfDosen) {
        Dosen02 dosenTertua = arrayOfDosen[0];
        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tampilkan(dosenTertua);
    }

    public void infoDosenPalingMuda(Dosen02[] arrayOfDosen) {
        Dosen02 dosenTermuda = arrayOfDosen[0];
        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        tampilkan(dosenTermuda);
    }

    private void tampilkan(Dosen02 dosen) {
        System.out.println("Kode           : " + dosen.kode);
        System.out.println("Nama           : " + dosen.nama);
        System.out.println("Jenis Kelamin  : " + dosen.getjenisKelamin());
        System.out.println("Usia           : " + dosen.usia);
        System.out.println("-----------------------------------------");
    }
    
}
