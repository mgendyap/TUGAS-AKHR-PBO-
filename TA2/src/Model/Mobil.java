// package Model;
// public class Mobil {
//     private String nomorPlat;
//     private String waktuMasuk;
//     private String waktuKeluar;

//     public Mobil(String nomorPlat, String waktuMasuk) {
//         this.nomorPlat = nomorPlat;
//         this.waktuMasuk = waktuMasuk;
//         this.waktuKeluar = null;
//     }

//     public void setWaktuKeluar(String waktuKeluar) {
//         this.waktuKeluar = waktuKeluar;
//     }
    
//     public double hitungBiayaParkir() {
//         if (waktuKeluar == null) {
//             System.out.println("Mobil belum keluar, biaya parkir tidak dapat dihitung.");
//             //return 0;
//         }

//         int selisihWaktu = hitungSelisihWaktu();

//         if (selisihWaktu <= 10) {
//             //return 0;
//         }

//         double biaya = 10000 + 5000 * Math.ceil((selisihWaktu - 10) / (24 * 60.0));

//         return biaya;
//     }

//     private int hitungSelisihWaktu() {
//         if (waktuKeluar == null) {
//             return 0;
//         }

//         int waktuMasukMenit = konversiKeMenit(waktuMasuk);
//         int waktuKeluarMenit = konversiKeMenit(waktuKeluar);

//         return waktuKeluarMenit - waktuMasukMenit;
//     }

//     private int konversiKeMenit(String waktu) {
//         String[] waktuSplit = waktu.split(":");
//         int jam = Integer.parseInt(waktuSplit[0]);
//         int menit = Integer.parseInt(waktuSplit[1]);

//         return jam * 60 + menit;
//     }

//     public String getNomorPlat() {
//         return nomorPlat;
//     }

//     public String getWaktuMasuk() {
//         return waktuMasuk;
//     }

//     public String getWaktuKeluar() {
//         return waktuKeluar;
//     }
// }
   
