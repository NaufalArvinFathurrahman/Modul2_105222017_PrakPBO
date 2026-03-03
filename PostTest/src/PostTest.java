import java.util.Scanner;

public class PostTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM PAYROLL PERUSAHAAN ===");
        System.out.print("Nama Karyawan    : ");
        String nama = input.nextLine(); 
        
        System.out.print("Gaji Pokok (Rp)  : ");
        double gajiPokok = input.nextDouble();
        
        System.out.print("Jumlah Jam Lembur: ");
        int jamLembur = input.nextInt();

        double upahLemburPerJam = gajiPokok / 173.0;

        double totalUangLembur = jamLembur * upahLemburPerJam;

        double gajiBruto = gajiPokok + totalUangLembur;

        double pajakPenghasilan = gajiBruto * 0.05;

        double potonganBPJS = gajiPokok * 0.01;

        double gajiBersih = gajiBruto - pajakPenghasilan - potonganBPJS;

        System.out.println("\n=== SLIP GAJI ===");
        System.out.println("Karyawan         : " + nama);
        System.out.println("Upah Lembur/Jam  : Rp " + upahLemburPerJam);
        System.out.println("Total Uang Lembur: Rp " + totalUangLembur);
        System.out.println("Gaji Bruto       : Rp " + gajiBruto);
        System.out.println("---------------------------------");
        System.out.println("Potongan Pajak   : Rp " + pajakPenghasilan);
        System.out.println("Potongan BPJS    : Rp " + potonganBPJS);
        System.out.println("---------------------------------");
        System.out.println("GAJI BERSIH      : Rp " + gajiBersih);
        System.out.println("=================================");

        input.close();
    }
}