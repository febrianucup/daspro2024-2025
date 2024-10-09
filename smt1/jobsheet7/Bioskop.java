package jobsheet7;

import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //deklarasi variabel
        int jumlahTiket=0, tiket=50000, totalTiket=0;
        double diskon=0, totalHarga=0, totalPendapatan=0;
        String respon;

        //looping
        while(true){
            //input jumlah tiket
            System.out.print("Masukkan Jumlah Tiket: ");
            jumlahTiket=input.nextInt();
            if(jumlahTiket<0){
                System.out.println("Input invalid");
            }else if(jumlahTiket>4){
                diskon=0.1*tiket;
            }else if(jumlahTiket>10){
                diskon=0.15*tiket;
            }else{
                diskon=0*tiket;
            }
            
            //hitung harga, total tiket, harga diskon
            totalTiket+=jumlahTiket;
            System.out.println("Diskon: " + diskon);
            totalHarga=jumlahTiket*(tiket-diskon);
            System.out.println("Total harga: "+totalHarga);
            totalPendapatan+=totalHarga;
            
            //pemilihan untuk melanjutkan looping atau tidak
            input.nextLine();
            System.out.print("Lanjutkan Transaksi (y/n)? ");
            respon=input.nextLine();
            if(respon.equalsIgnoreCase("y")){
                continue;
            }else if(respon.equalsIgnoreCase("n")){
                break;
            }
        }

        System.out.println("Total Penjualan Tiket Hari Ini: " + totalTiket);
        System.out.println("Total Pendapatan Hari Ini: " + totalPendapatan);
    }
}