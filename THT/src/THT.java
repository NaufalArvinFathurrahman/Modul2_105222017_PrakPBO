import java.util.Scanner;

public class THT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM LOGICALC FASTSEND ===");
        System.out.print("Masukkan Nama Klien    : ");
        String namaKlien = input.nextLine();
        System.out.print("Masukkan Berat (Kg)    : ");
        double berat = input.nextDouble();
        System.out.print("Masukkan Jarak (Km)    : ");
        int jarak = input.nextInt();
        System.out.print("Masukkan Jumlah Box    : ");
        int jumlahBox = input.nextInt();

        int trukPenuh = jumlahBox / 150;
        int boxSisa = jumlahBox % 150;

        int jam = jarak / 60;
        int menit = jarak % 60;

        double dasarBiaya = (15000.0 * jarak) + (5500.0 * berat);
        double asuransi = 0.035 * dasarBiaya;
        double totalBayar = dasarBiaya + asuransi;

        System.out.println("=== RESI PENGIRIMAN ===");
        System.out.println("Klien           : " + namaKlien);
        System.out.println("Total Box       : " + jumlahBox + " box");
        System.out.println("Kebutuhan Armada: " + trukPenuh + " Truk Penuh dan sisa " + boxSisa + " box via Pikap.");
        System.out.println("Estimasi Waktu  : " + jam + " Jam " + menit + " Menit (Asumsi 60km/jam)");
        System.out.println("=== RINCIAN BIAYA ===");
        System.out.println("Dasar Biaya     : Rp " + dasarBiaya);
        System.out.println("Asuransi (3.5%) : Rp " + asuransi);
        System.out.println("-----------------------------------");
        System.out.println("TOTAL BAYAR     : Rp " + totalBayar);
        System.out.println("===================================");

        input.close();
    }
}