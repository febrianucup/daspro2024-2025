package jobsheet7;

import java.util.Scanner;

public class SiakadFor19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //deklarasi variabel
        double nilai, tertinggi=0, terendah=100, lulus=0, tidakLulus=0;

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

            if(nilai>=60){
                lulus++;
            }else if(nilai<60){
                tidakLulus++;
            }
        }
        System.out.println("Nilai Tertinggi= " + tertinggi);
        System.out.println("Nilai Terendah= " + terendah);
        System.out.println("Jumlah siswa yang lulus: " + lulus);
        System.out.println("Jumlah siswa yang tidak lulus: " + tidakLulus);
    }
}
