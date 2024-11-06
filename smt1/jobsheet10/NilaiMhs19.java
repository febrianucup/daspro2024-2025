package jobsheet10;

import java.util.Scanner;

public class NilaiMhs19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //deklarasi variable
        int jumlahMhs=0, rata2, terendah=100,tertinggi=0, totalNilai=0;

        System.out.print("Masukkan jumlah Mahasiswa: ");
        jumlahMhs=input.nextInt();

        int[] nilaiMhs=new int[jumlahMhs];

        //perulangan pertama
        for (int i=0;i<nilaiMhs.length;i++) {
            System.out.print("Input Nilai Mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i]=input.nextInt();
        }

        for(int i=0;i<nilaiMhs.length;i++){
            totalNilai+=nilaiMhs[i];
        }

        rata2=totalNilai/jumlahMhs;
        System.out.println("Nilai rata-rata mahaasiswa: " + rata2);

        for(int i=0;i<nilaiMhs.length;i++){
            if (nilaiMhs[i]>tertinggi) {
                tertinggi=nilaiMhs[i];    
            }else if(nilaiMhs[i]<terendah){
                terendah=nilaiMhs[i];
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        for(int i=0;i<nilaiMhs.length;i++){
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + ": " + nilaiMhs[i]);
        }
    }
}
