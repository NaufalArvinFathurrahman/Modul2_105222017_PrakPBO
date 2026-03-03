import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Tanggal Lahir : ");
        int tanggalLahir = input.nextInt();

        input.nextInt();

        System.out.println("Masukkan Nama Lengkap : ");
        int namaLengkap = input.nextInt();

        System.out.println(namaLengkap + " " + tanggalLahir);
        input.close();
    }
}
