package jobsheet12;

import java.util.Scanner;

public class Kafe19 {
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setip pembelian!");
        }

        System.out.println("====MENU RESTO KAFE====");
        System.out.println("1. Kopi Hitam - Rp. 15.000");
        System.out.println("2. Cappucino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("==============================");
        System.out.println("Silahkan Pilih Menu yang Anda Inginkan");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems={15000,20000,22000,12000,10000,18000};
        
        int hargaTotal=hargaItems[pilihanMenu-1]*banyakItem;
        return hargaTotal;
    }

    public static void daftarPengunjung(String... namaPengunjung){
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("-" + namaPengunjung);
        }
    }

    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        Menu("Andi", true);
        System.out.print("\nMasukkan Nomor Menu yang Ingin Anda Pesan: ");
        int pilihanMenu=input.nextInt();
        System.out.print("Masukkan Jumlah Item yang Ingin Dipesan: ");
        int banyakItem=input.nextInt();

        int totalHarga=hitungTotalHarga(pilihanMenu, banyakItem);

        System.out.println("Total harga unntuk pesanan anda adalah : Rp. " + totalHarga);

        daftarPengunjung("Ali", "Budi", "Citra");
    }
}
