import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();

        double fahrenheit = (celcius * 9.0 / 5.0) + 32.0;
        double kelvin = celcius + 273.15;
        double reamur = celcius * 4.0 / 5.0;

        System.out.println("\n--- Hasil Konversi Suhu ---");
        System.out.printf("Celcius    : %.2f C\n", celcius);
        System.out.printf("Fahrenheit : %.2f F\n", fahrenheit);
        System.out.printf("Kelvin     : %.2f K\n", kelvin);
        System.out.printf("Reamur     : %.2f R\n", reamur);

        input.close();
    }
}