package jobsheet6;

import java.util.Scanner;

public class Pemilihan2Pecobaan1No19 {
    public static void main(String[] args) {
        //scanner
        Scanner input=new Scanner(System.in);
        
        //deklarasi variabel
        System.out.print("Masukkan Tahun: ");
        int tahun;

        //input
        tahun=input.nextInt();

        if(tahun%4==0){
            if(tahun%100!=0){
                System.out.println("Tahun Kabisat");
            }
        }else{
            System.out.println("Bukan Tahun Kabisat");
        }

    }
}
