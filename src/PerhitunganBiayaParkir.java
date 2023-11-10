import java.util.Scanner;

public class PerhitunganBiayaParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam parkir: ");
        int jamParkir = scanner.nextInt();

        double biayaParkir = hitungBiayaParkir(jamParkir);

        System.out.println("Biaya parkir yang harus dibayar: $" + biayaParkir);
    }
    public static double hitungBiayaParkir(int jamParkir) {
        final double BIAYA_PERTAMA = 1.0;
        final double BIAYA_SELANJUTNYA = 0.5;
        final double BIAYA_FLAT = 15.0;
        final int BATAS_JAM_FLAT = 24;

        if (jamParkir <= 5) {
            return BIAYA_PERTAMA;
        } else if (jamParkir <= BATAS_JAM_FLAT) {
            return BIAYA_PERTAMA + (jamParkir - 5) * BIAYA_SELANJUTNYA;
        } else {
            return BIAYA_FLAT;
        }
    }
}
