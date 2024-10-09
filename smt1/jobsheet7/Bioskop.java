package jobsheet7;

import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //deklarasi variabel
        int jumlahTiket=0, tiket=50000, totalTiket=0, jumlahPengunjung;
        double diskon=0, totalHarga=0, totalHargaDiskon=0, totalPendapatan=0;

        //input
        System.out.print("Masukkan jumlah pengunjung hari ini: ");
        jumlahPengunjung=input.nextInt();

        //looping
        for(int i=1;i<=jumlahPengunjung;i++){
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

            totalTiket+=jumlahTiket;
            totalHarga=jumlahTiket*tiket;
            System.out.println("Total harga: "+totalHarga);
            totalHargaDiskon=totalHarga-(totalHarga*diskon);
            System.out.println("Total Harga plus diskon: " + totalHargaDiskon);
            totalPendapatan+=totalHargaDiskon;
        }

        System.out.println("Total Penjualan Tiket Hari Ini: " + totalTiket);
        System.out.println("Total Pendapatan Hari Ini: " + totalPendapatan);
        
        
    }
}