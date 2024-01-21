// package Controller;

// // KontrolParkir.java
// import java.util.Scanner;

// import Model.Mobil;
// import Model.ModelParkir;
// import View.TampilanParkir;

// public class KontrolParkir {
//     private ModelParkir model;
//     private TampilanParkir tampilan;

//     public KontrolParkir(ModelParkir model, TampilanParkir tampilan) {
//         this.model = model;
//         this.tampilan = tampilan;
//     }

//     public void prosesCheckIn(String nomorPlat, String waktuMasuk) {
//         Mobil mobil = new Mobil(nomorPlat, waktuMasuk);
//         model.tambahMobil(mobil);
//         tampilan.tampilkanMobilParkir(model.semuaMobil());
//     }

//     public void prosesCheckOut(String nomorPlat, String waktuKeluar) {
//         Mobil mobilKeluar = null;
//         for (Mobil mobil : model.semuaMobil()) {
//             if (mobil.getNomorPlat().equals(nomorPlat)) {
//                 mobil.setWaktuKeluar(waktuKeluar);
//                 mobil.hitungBiayaParkir();
//                 mobilKeluar = mobil;
//                 break;
//             }
//         }
//         if (mobilKeluar != null) {
//             model.keluarkanMobil(mobilKeluar);
//             tampilan.tampilkanBiayaParkir(nomorPlat, mobilKeluar.hitungBiayaParkir());
//             tampilan.tampilkanStruk(nomorPlat, mobilKeluar.getWaktuMasuk(), mobilKeluar.getWaktuKeluar(), mobilKeluar.hitungBiayaParkir());
//             tampilan.tampilkanMobilParkir(model.semuaMobil());
//         } else {
//             System.out.println("Mobil dengan nomor plat " + nomorPlat + " tidak ditemukan.");
//         }
//     }
// }
