package jobsheet7;

import java.util.Scanner;

public class SiakadWhile19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //deklareasi variabel
        double nilai;
        int jmlh, i=0;

        //input
        System.out.print("Masukkan jumlah: ");
        jmlh=input.nextInt();

        //perulangan
        while(i<jmlh){
            System.out.print("Nilai Mahasiswa " + (i+1) + ": ");
            nilai=input.nextInt();
            if(nilai<0 || nilai>100){
                System.out.println("Nilai Tidak Valid, Mohon Input Nilai Kembali");
                continue;
            }
            if(nilai>80 && nilai<=100){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah A");
                System.out.println("Bagus, Pertahankan Nilainya");
            }else if(nilai>73 && nilai<=80){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah B+");
            }else if(nilai>65 && nilai<=73){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah B");
            }else if(nilai>60 && nilai<=65){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah C+");
            }else if(nilai>50 && nilai<=60){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah C");
            }else if(nilai>39 && nilai<=50){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah D");
            }else if(nilai<=39){
                System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah E");
            }

            i++;
        }
    }
}
