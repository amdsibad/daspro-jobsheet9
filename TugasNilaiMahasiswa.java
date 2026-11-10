import java.util.Scanner;

public class TugasNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        do {
            System.out.print("Masukkan banyaknya nilai mahasiswa: ");
            jumlah = input.nextInt();
            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0, coba lagi.");
            }
        } while (jumlah <= 0);

        int[] nilai = new int[jumlah];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        double rata2 = (double) total / nilai.length;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        System.out.println();
        System.out.println("=== Daftar Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }

        System.out.println();
        System.out.println("=== Ringkasan ===");
        System.out.println("Total nilai    : " + total);
        System.out.println("Rata-rata      : " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

        input.close();
    }
}