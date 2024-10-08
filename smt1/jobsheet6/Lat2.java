package jobsheet6;

import java.util.Scanner;

public class Lat2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //deklarasi var
        String jenisBuku;
        int jumlah;
        double diskon=0;

        //input
        System.out.print("Jenis Buku: ");
        jenisBuku=input.nextLine();
        System.out.print("Jumlah Buku: ");
        jumlah=input.nextInt();

        //pemilihan
        if(jenisBuku.equalsIgnoreCase("kamus")){
            diskon=0.1;
            if(jumlah>2){
                diskon= diskon + 0.02;
            }
        }else if(jenisBuku.equalsIgnoreCase("novel")){
            diskon=0.07;
            if(jumlah>3){
                diskon=diskon+0.02;
            }else{
                diskon=diskon+0.01;
            }
        }else if(jumlah>3){
            diskon=diskon +0.05;
        }

        //output
        System.out.println("Total diskon yang diterima sebesadr: " + diskon + "%");
    }
}
