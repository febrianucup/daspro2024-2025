package jobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan2No19 {
    public static void main(String[] args) {
        //scanner
        Scanner input=new Scanner(System.in);
        
        //deklarasi variabel
        String member, qris;
        int jumlah_beli, potongan=1000, menu;
        double total_bayar=0, diskon, harga=0;

        //input
        System.err.println("============================");
        System.out.println("\tMenu Cafe 1A");
        System.err.println("============================");
        System.out.println("1. Rice Bowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Rice Bowl + Ice Tea)");
        System.out.println("============================");
        System.out.print("Masukkan Menu: ");
        menu=input.nextInt();
        System.out.print("Masukkan Jumlah: ");
        jumlah_beli=input.nextInt();
        input.nextLine();
        System.out.print("Punya Member (y/t) ? ");
        member=input.nextLine();
        System.out.print("Apakah menggunakan Qris (y/t) ? ");
        qris=input.nextLine();

        //controlstatement
        if(member.equalsIgnoreCase("y")){
            diskon=0.1;
            if(qris.equalsIgnoreCase("y")){
                if(menu==1){
                    harga=14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                }else if(menu==2){
                    harga=3000;
                    System.out.println("Harga Ice Tea: " + harga);
                }else if(menu==3){
                    harga=15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }
    
                //menghitung total bayar dengan diskon
                total_bayar=harga-(harga*diskon)*jumlah_beli-potongan;
                System.out.println("Total Bayar Sebesar " + total_bayar);
            }else if(qris.equalsIgnoreCase("t")){
                if(menu==1){
                    harga=14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                }else if(menu==2){
                    harga=3000;
                    System.out.println("Harga Ice Tea: " + harga);
                }else if(menu==3){
                    harga=15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }
                total_bayar=harga*jumlah_beli-potongan;
                System.out.println("Total Bayar Sebesar " + total_bayar);
            }else{
                System.out.println("Inputan Qris Salah");
            }
        }else if(member.equalsIgnoreCase("y")){
            diskon=0.1;
            if(menu==1){
                harga=14000;
                System.out.println("Harga RIce Bowl: " + harga);
            }else if(menu==2){
                harga=3000;
                System.out.println("Harga Ice Tea: " + harga);
            }else if(menu==3){
                harga=15000;
                System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
            }

            //menghitung total bayar dengan diskon
            total_bayar=harga-(harga*diskon)*jumlah_beli;
            System.out.println("Total Bayar Sebesar " + total_bayar);
        }else if(member.equalsIgnoreCase("t")){
                if(menu==1){
                    harga=14000;
                    System.out.println("Harga RIce Bowl: " + harga);
                }else if(menu==2){
                    harga=3000;
                    System.out.println("Harga Ice Tea: " + harga);
                }else if(menu==3){
                    harga=15000;
                    System.out.println("Harga Paket Bunding (Rice Bowl + Ice Tea): " + harga);
                }
                total_bayar=harga*jumlah_beli;
                System.out.println("Total Bayar Sebesar " + total_bayar);
        }else{
            System.out.println("Inputan Member Salah");
        }
    }
}
