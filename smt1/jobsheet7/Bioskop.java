package jobsheet7;

import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //deklarasi variabel
        int jumlahTiket=0, tiket=50000, totalTiket=0, jumlahPengunjung;
        double diskon=0, totalHarga=0, totalHargaDiskon=0, totalPendapatan=0;
        String respon;

        //input
        // System.out.print("Masukkan jumlah pengunjung hari ini: ");
        // jumlahPengunjung=input.nextInt();

        //looping
        while(true){
            //input jumlah tiket
            System.out.print("Masukkan Jumlah Tiket: ");
            jumlahTiket=input.nextInt();
            if(jumlahTiket<0){
                System.out.println("Input invalid");
            }else if(jumlahTiket>4){
                diskon=0.1;
            }else if(jumlahTiket>10){
                diskon=0.15;
            }else{
                diskon=0;
            }
            
            //hitung harga, total tiket, harga diskon
            totalTiket+=jumlahTiket;
            totalHarga=jumlahTiket*tiket;
            System.out.println("Total harga: "+totalHarga);
            totalHargaDiskon=totalHarga-(totalHarga*diskon);
            System.out.println("Total Harga plus diskon: " + totalHargaDiskon);
            totalPendapatan+=totalHargaDiskon;
            
            //pemilihan untuk melanjutkan looping atau tidak
            input.nextLine();
            System.out.print("Lanjutkan Transaksi (y/n)? ");
            respon=input.nextLine();
            if(respon.equalsIgnoreCase("y")){
                continue;
            }else if(respon.equalsIgnoreCase("n")){
                break;
            }else{
                System.out.println("Input invalid, silahkan mengulang pemesanan");
                break;
            }
        }

        System.out.println("Total Penjualan Tiket Hari Ini: " + totalTiket);
        System.out.println("Total Pendapatan Hari Ini: " + totalPendapatan);
        
        
    }
}