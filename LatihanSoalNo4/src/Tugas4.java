import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        int totalDetik = input.nextInt();

        int jam = totalDetik / 3600;
        int sisaDetikSetelahJam = totalDetik % 3600;
        
        int menit = sisaDetikSetelahJam / 60;
        int detik = sisaDetikSetelahJam % 60;

        System.out.println("Hasil konversi: " + jam + " Jam, " + menit + " Menit, " + detik + " Detik.");

        input.close();
    }
}