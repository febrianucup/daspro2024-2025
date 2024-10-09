package jobsheet7;

import java.util.Scanner;

public class SiakadDoWhile19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //deklarasi variabel
        String namaPelanngan;
        int kopi, teh, roti;
        int hargaKopi=12000, hargaTeh=7000, hargaRoti=20000;

        do{
            System.out.print("Masukkan Nama Pelanggan: ");
            namaPelanngan=input.nextLine();

            if(namaPelanngan.equalsIgnoreCase("batal")){
                System.out.println("Pesanan dibatalkan");
                System.out.println("Semua transaksi selesai");
                break;
            }

            System.out.print("Jumlah Kopi: ");
            kopi=input.nextInt();
            System.out.print("Jumlah Teh: ");
            teh=input.nextInt();
            System.out.print("Jumlah Roti: ");
            roti=input.nextInt();

            //total harga
            int totalHarga=(kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Total Harga: Rp. " + totalHarga);
            input.nextLine();
        }while(true);
    }
}
