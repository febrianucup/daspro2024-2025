package jobsheet12;

import java.util.Scanner;

public class Kafe19_2 {
    public static void   Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setip pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat anda mendapatkan diskon 50%");
        }else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat anda mendapatkan diskon 30%");
        }else{
            System.out.println("Kode promo tidak tersedia");
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

    public static int  hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems={15000,20000,22000,12000,10000,18000};
     
        int hargaTotal=hargaItems[pilihanMenu-1]*banyakItem;
        if (kodePromo.equals("DISKON50")) {
            hargaTotal-=hargaTotal*(0.5);
        }else if (kodePromo.equals("DISKON30")) {
            hargaTotal-=hargaTotal*(0.3);
        }else{
            System.out.println("Kode invalid");
        }
        return hargaTotal;        
    }

    // public static void daftarPengunjung(String... namaPengunjung){
    //     for (int i = 0; i < namaPengunjung.length; i++) {
    //         System.out.println("-" + namaPengunjung);
    //     }
    // }

    public static void main(String[] args) {
        Scanner input=new  Scanner(System.in);
        Menu("Andi", true, "DISKON30");
        int banyakItem=0, pilihanMenu=0;
        String next="";
        int totalHarga=0;
        int totalItem=0;
        do{
            System.out.print("\nMasukkan Nomor Menu yang Ingin Anda Pesan: ");
            pilihanMenu=input.nextInt();
            System.out.print("Masukkan Jumlah Item yang Ingin Dipesan: ");
            banyakItem=input.nextInt();
            input.nextLine();
            System.out.print("Lanjut? (y/n) ");
            next=input.nextLine();
            totalHarga+=hitungTotalHarga(pilihanMenu, banyakItem, "DISKON50");
            totalItem+=banyakItem;
        }while(next.equalsIgnoreCase("y"));

        

        System.out.println("Total harga unntuk pesanan anda adalah : Rp. " + totalHarga);
        System.out.println("Total pesanan yang dibeli adalah: " + totalItem + " item");

        // daftarPengunjung("Ali", "Budi", "Citra");
    }
}
