package Latihan;

import java.util.Scanner;

public class CafeDiskon {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int[] harga={15000, 10000, 20000, 18000};
        String[] menu={"Kopi", "Teh", "Cireng", "Kentang Goreng"};

        tabelMenu(menu, harga);

        System.out.println("--Input Jumlah Pesanan--");
        int total=totalharga(0, harga, menu);
        System.out.println("Total harga: " + total);
        
        double diskon=0.1;

        if (total>100000) {
            double hargaDiskon=total-(total*diskon);
            System.out.println("Harga setelah mendapatkan diskon 10% : " + hargaDiskon);
        }else{
            System.out.println("Tidak mendaptkan diskon dikareanakan pembelian kurang dari Rp. 100.000,00");
        }

    }

    static int totalharga(int a, int[] b, String[] c){
        if (a<b.length) {
            System.out.print("Masukkan jumlah pesanan " + c[a] + ": ");
            int jumlah=input.nextInt(); 
            return b[a]*jumlah + totalharga(a+1, b, c);
        }else{
            return 0;
        }
    }

    static void tabelMenu(String[] a, int[] b){
        System.out.println("--Tabel Menu--");
        System.out.println("Nama Menu\t" + "Harga(Rp.)");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].format("%-16s", a[i]) + b[i]);
        }
    }
}
