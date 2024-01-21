// // Main.java
// import java.util.Scanner;

// import Controller.KontrolParkir;
// import Model.ModelParkir;
// import View.TampilanParkir;

// public class App {
//     public static void main(String[] args) {
//         ModelParkir model = new ModelParkir();
//         TampilanParkir tampilan = new TampilanParkir();
//         KontrolParkir kontrol = new KontrolParkir(model, tampilan);

//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.println("1. Check-in");
//             System.out.println("2. Check-out");
//             System.out.println("4. Keluar");
//             System.out.print("Pilih opsi: ");

//             int pilihan = scanner.nextInt();
//             scanner.nextLine(); // konsumsi karakter baris baru

//             switch (pilihan) {
//                 case 1:
//                     System.out.print("Masukkan nomor plat: ");
//                     String nomorPlatMasuk = scanner.nextLine();
//                     System.out.print("Masukkan waktu masuk: ");
//                     String waktuMasuk = scanner.nextLine();
//                     kontrol.prosesCheckIn(nomorPlatMasuk, waktuMasuk);
//                     break;

//                 case 2:
//                     System.out.print("Masukkan nomor plat: ");
//                     String nomorPlatKeluar = scanner.nextLine();
//                     System.out.print("Masukkan waktu keluar: ");
//                     String waktuKeluar = scanner.nextLine();
//                     kontrol.prosesCheckOut(nomorPlatKeluar, waktuKeluar);
//                     break;

//                 case 3:
//                     System.out.println("Keluar dari program.");
//                     System.exit(0);

//                 default:
//                     System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
//             }
//         }
//     }
// }
