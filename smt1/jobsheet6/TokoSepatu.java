package jobsheet6;

import java.util.Scanner;

public class TokoSepatu {
    public static void main(String[] args) {
        //scanner
        Scanner input=new Scanner(System.in);

        //deklarasi variabel
        int kategori;
        int merk, ukuran, harga=0;

        //input
        System.err.println("============================");
        System.out.println("       Toko Sepatu 1A");
        System.err.println("============================");
        System.out.println("1. Converse:");
        System.out.println("\t 1. Slip On");
        System.out.println("\t 2. High Top");
        System.out.println("2. Sketcher:");
        System.out.println("\t 1. Woman");
        System.out.println("\t 2. Man");
        System.out.println("3. Nike:");
        System.out.println("\t 1. Kids");
        System.out.println("\t 2. Adult");
        System.out.print("Pilih Merk= ");
        merk=input.nextInt();
        input.nextLine();
        System.out.print("Pilih Kategori= ");
        kategori=input.nextInt();
        System.out.print("Masukkan Ukuran Sepatu= ");
        ukuran=input.nextInt();

        //pemilihan
        if(merk==1){
            if(kategori==1){
                if(ukuran>=36 && ukuran<=40){
                    harga=800000;
                }else{
                    System.out.println("invalid");
                }
            }else if(kategori==2){
                if(ukuran>=40 && ukuran<=44){
                    harga=1200000;
                }else{
                    System.out.println("invalid");
                }
            }else{
                System.out.println("invalid kategori");
            }
        }else if(merk==2){
            if(kategori==1){
                if(ukuran>=36 && ukuran<=41){
                    harga=1000000;
                }else{
                    System.out.println("invalid");
                }
            }else if(kategori==2){
                if(ukuran>=41 && ukuran<=44){
                    harga=1800000;
                }else{
                    System.out.println("invalid");
                }
            }else{
                System.out.println("invalid kategori");
            }
        }else if(merk==3){
            if(kategori==1){
                if(ukuran>=36 && ukuran<=40){
                    harga=750000;
                }else{
                    System.out.println("invalid");

                }
            }else if(kategori==2){
                if(ukuran>=40 && ukuran<=44){
                    harga=1500000;
                }else{
                    System.out.println("invalid");
                }
            }else{
                System.out.println("invalid kategori");
            }
        }else{
            System.out.println("invalid merk");
        }

        //output
        System.err.println("============================");
        System.out.println("\tTotal Bayar");
        System.err.println("============================");
        System.out.println("Merk= " + merk);
        System.out.println("Kategori= " + kategori);
        System.out.println("Ukuran= " + ukuran);
        System.out.println("Total Bayar adalah " + harga);
    }
}
