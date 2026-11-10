import java.util.Scanner;

public class SearchNilai02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        do {
            System.out.print("Masukkan banyaknya elemen array: ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Banyak elemen harus lebih dari 0, coba lagi.");
            }
        } while (n <= 0);

        int[] nilai = new int[n];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai (key) yang ingin dicari: ");
        int key = input.nextInt();

        boolean ditemukan = false;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Nilai yang dicari tidak ditemukan: nilai " + key
                    + " tidak ada di dalam array yang berisi " + nilai.length + " elemen.");
        }

        input.close();
    }
}