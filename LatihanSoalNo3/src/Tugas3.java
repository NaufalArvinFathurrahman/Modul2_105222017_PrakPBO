import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaA = 25500;
        int hargaB = 14200;

        System.out.print("Jumlah Barang A yang dibeli: ");
        int jumlahA = input.nextInt();
        
        System.out.print("Jumlah Barang B yang dibeli: ");
        int jumlahB = input.nextInt();
        
        System.out.print("Jumlah Uang yang dibayarkan pelanggan: Rp ");
        int uangBayar = input.nextInt();

        int subtotal = (jumlahA * hargaA) + (jumlahB * hargaB);
        double ppn = subtotal * 0.11;
        int totalBelanja = (int) (subtotal + ppn);

        int kembalian = uangBayar - totalBelanja;

        int lembar50k = kembalian / 50000;
        int sisaKembalian = kembalian % 50000;

        int lembar10k = sisaKembalian / 10000;

        System.out.println("\n--- Struk Pembayaran ---");
        System.out.println("Subtotal        : Rp " + subtotal);
        System.out.println("PPN (11%)       : Rp " + (int)ppn);
        System.out.println("Total Belanja   : Rp " + totalBelanja);
        System.out.println("Uang Dibayar    : Rp " + uangBayar);
        System.out.println("Kembalian       : Rp " + kembalian);
        
        System.out.println("\n--- Pecahan Kembalian ---");
        System.out.println("Lembar Rp 50.000 : " + lembar50k + " lembar");
        System.out.println("Lembar Rp 10.000 : " + lembar10k + " lembar");

        input.close();
    }
}