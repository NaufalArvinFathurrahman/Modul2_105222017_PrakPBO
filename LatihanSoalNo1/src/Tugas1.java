import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang ruangan (meter): ");
        double panjang = input.nextDouble();
        
        System.out.print("Masukkan lebar ruangan (meter): ");
        double lebar = input.nextDouble();
        
        System.out.print("Masukkan tinggi ruangan (meter): ");
        double tinggi = input.nextDouble();

        double luasDinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi);

        double kebutuhanCat = Math.ceil(luasDinding / 10.0);

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Luas permukaan dinding : " + luasDinding + " meter persegi");
        System.out.println("Kebutuhan cat          : " + kebutuhanCat + " liter");

        input.close();
    }
}