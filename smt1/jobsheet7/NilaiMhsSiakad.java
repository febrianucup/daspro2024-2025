package jobsheet7;

import java.util.Scanner;

public class NilaiMhsSiakad {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //deklarasi variabel
        double nilai, tertinggi=0, terendah=100;

        //looping
        for(int i=1;i<=10;i++){
            System.out.print("Masukkan Nilai: ");
            nilai=input.nextDouble();
            if(nilai>tertinggi){
                tertinggi=nilai;
            }
            if(nilai<terendah){
                terendah=nilai;
            }
        }
        System.out.println("Nilai Tertinggi= " + tertinggi);
        System.out.println("Nilai Terendah= " + terendah);
    }
}
