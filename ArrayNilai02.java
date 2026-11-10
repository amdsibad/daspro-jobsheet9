import java.util.Scanner;

public class ArrayNilai02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        System.out.println();
        System.out.println("--- Pertanyaan 4: rekap ---");
        System.out.println("Jumlah mahasiswa LULUS       : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa TIDAK LULUS : " + jumlahTidakLulus);

        input.close();
    }
}
