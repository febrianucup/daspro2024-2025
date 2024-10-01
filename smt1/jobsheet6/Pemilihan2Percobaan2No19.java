package jobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan2No19 {
    public static void main(String[] args) {
        //scanner
        Scanner input=new Scanner(System.in);
        
        //deklarasi variabel
        String menu, member, qris;
        int jumlah_beli, potongan=1000;
        double total_bayar=0, diskon, harga=0;

        //input
        System.err.println("============================");
        System.out.println("\tMenu Cafe 1A");
        System.err.println("============================");
        System.out.print("Punya Member (y/t) ? ");
        member=input.nextLine().toLowerCase();
        System.out.print("Masukkan Menu: ");
        menu=input.nextLine().toLowerCase();
        System.out.print("Masukkan Jumlah: ");
        jumlah_beli=input.nextInt();
        input.nextLine();
        System.out.print("Apakah menggunakan Qris (y/t) ? ");
        qris=input.nextLine().toLowerCase();

        //controlstatement
        if(qris.equals("y")){
            if(member.equals("y")){
                diskon=0.1;
                if(menu.equals("kopi")){
                    harga=12000;
                    System.out.println("Harga Kopi: " + harga);
                }else if(menu.equals("teh")){
                    harga=7000;
                    System.out.println("Harga Teh: " + harga);
                }else if(menu.equals("roti")){
                    harga=20000;
                    System.out.println("Harga Roti: " + harga);
                }
    
                //menghitung total bayar dengan diskon
                total_bayar=harga-(harga*diskon)*jumlah_beli-potongan;
            }else{
                if(menu.equals("kopi")){
                    harga=12000;
                    System.out.println("Harga Kopi: " + harga);
                }else if(menu.equals("teh")){
                    harga=7000;
                    System.out.println("Harga Teh: " + harga);
                }else if(menu.equals("roti")){
                    harga=20000;
                    System.out.println("Harga Roti: " + harga);
                }
                total_bayar=harga*jumlah_beli-potongan;
            }
        }else{
            if(member.equals("y")){
                diskon=0.1;
                if(menu.equals("kopi")){
                    harga=12000;
                    System.out.println("Harga Kopi: " + harga);
                }else if(menu.equals("teh")){
                    harga=7000;
                    System.out.println("Harga Teh: " + harga);
                }else if(menu.equals("roti")){
                    harga=20000;
                    System.out.println("Harga Roti: " + harga);
                }
    
                //menghitung total bayar dengan diskon
                total_bayar=harga-(harga*diskon)*jumlah_beli;
            }else{
                if(menu.equals("kopi")){
                    harga=12000;
                    System.out.println("Harga Kopi: " + harga);
                }else if(menu.equals("teh")){
                    harga=7000;
                    System.out.println("Harga Teh: " + harga);
                }else if(menu.equals("roti")){
                    harga=20000;
                    System.out.println("Harga Roti: " + harga);
                }
                total_bayar=harga*jumlah_beli;
            }
        }
        //output
        System.err.println("============================");
        System.out.println("\tTotal Bayar");
        System.err.println("============================");
        System.out.println("Total Bayar Sebesar "+total_bayar);
    }
}
