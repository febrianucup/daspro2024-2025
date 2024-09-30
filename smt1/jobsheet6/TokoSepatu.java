package jobsheet6;

import java.util.Scanner;

public class TokoSepatu {
    public static void main(String[] args) {
        //scanner
        Scanner input=new Scanner(System.in);

        //deklarasi variabel
        String merk, kategori;
        int ukuran, harga=0;

        //input
        System.err.println("============================");
        System.out.println("       Toko Sepatu 1A");
        System.err.println("============================");
        System.out.print("Masukkan Merk= ");
        merk=input.nextLine().toLowerCase();
        System.out.print("Masukkan Kategori= ");
        kategori=input.nextLine().toLowerCase();
        System.out.print("Masukkan Ukuran Sepatu= ");
        ukuran=input.nextInt();

        //pemilihan
        if(merk.equals("converse")){
            if(kategori.equals("slip on")){
                if(ukuran>=36 && ukuran<=40){
                    harga=800000;
                }else{
                    System.out.println("invalid");
                }
            }else if(kategori.equals("high top")){
                if(ukuran>=40 && ukuran<=44){
                    harga=1200000;
                }else{
                    System.out.println("invalid");
                }
            }else{
                System.out.println("invalid kategori");
            }
        }else if(merk.equals("sketcher")){
            if(kategori.equals("woman")){
                if(ukuran>=36 && ukuran<=41){
                    harga=1000000;
                }else{
                    System.out.println("invalid");
                }
            }else if(kategori.equals("man")){
                if(ukuran>=41 && ukuran<=44){
                    harga=1800000;
                }else{
                    System.out.println("invalid");
                }
            }else{
                System.out.println("invalid kategori");
            }
        }else if(merk.equals("nike")){
            if(kategori.equals("kids")){
                if(ukuran>=36 && ukuran<=40){
                    harga=750000;
                }else{
                    System.out.println("invalid");
                }
            }else if(kategori.equals("adult")){
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
