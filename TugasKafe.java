import java.util.Scanner;

public class TugasKafe {

    static int cariMenu(String[] menu, String nama) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(nama.trim())) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== KAFE KAMPUS ===");
        System.out.println("Daftar Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d. %-16s Rp %,d%n", (i + 1), menu[i], harga[i]);
        }

        System.out.println();
        System.out.println("--- Pencarian Menu ---");
        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cari = input.nextLine();
        int idx = cariMenu(menu, cari);
        if (idx != -1) {
            System.out.printf("Menu \"%s\" tersedia dengan harga Rp %,d%n", menu[idx], harga[idx]);
        } else {
            System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia.");
        }

        System.out.println();
        System.out.println("--- Pemesanan ---");
        int jumlah;
        do {
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            jumlah = Integer.parseInt(input.nextLine().trim());
            if (jumlah <= 0) {
                System.out.println("Jumlah harus lebih dari 0, coba lagi.");
            }
        } while (jumlah <= 0);

        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int totalBiaya = 0;

        for (int i = 0; i < jumlah; i++) {
            int pos;
            do {
                System.out.print("Pesanan ke-" + (i + 1) + " (nama menu): ");
                String nama = input.nextLine();
                pos = cariMenu(menu, nama);
                if (pos == -1) {
                    System.out.println("Menu tidak tersedia, silakan pilih menu sesuai daftar.");
                }
            } while (pos == -1);

            pesanan[i] = menu[pos];
            hargaPesanan[i] = harga[pos];
            totalBiaya += harga[pos];
        }

        System.out.println();
        System.out.println("=============== STRUK PESANAN ===============");
        System.out.printf("%-4s %-20s %15s%n", "No", "Menu", "Harga");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%-4d %-20s %,15d%n", (i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("---------------------------------------------");
        System.out.printf("%-25s Rp %,12d%n", "TOTAL BIAYA", totalBiaya);
        System.out.println("=============================================");

        input.close();
    }
}