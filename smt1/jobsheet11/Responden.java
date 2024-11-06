package jobsheet11;

import java.util.Scanner;

public class Responden {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //input untuk jumlah responsden dan soal
        System.out.print("Jumlah responden: ");
        int responden=input.nextInt();
        System.out.print("Jumlah pertanyaan setiap responden: ");
        int pertanyaan=input.nextInt();
        System.out.println("========================================");

        //deklarasi array
        int[][] survei=new int[responden][pertanyaan];

        //deklarasi variable yang dibutuhkan;
        int totalKeseluruhan=0, respon;
        double rata2Responden;

        //perulangan untuk menghitung rata2 tiap responden
        for (int i=0;i<survei.length;i++) {
            System.out.println("Responden ke-" + (i+1));
            int totalHasilResponden=0;

            for(int j=0;j<survei[i].length;j++){
                System.out.print("Input respon soal ke-" + (j+1) + ": ");
                survei[i][j]=input.nextInt();
                respon=survei[i][j];
                if (respon>5 || respon<=0) {
                    System.out.println("Masukkan respon dengan benar!");
                    continue;
                }else{
                    totalHasilResponden+=respon;
                }
            }

            totalKeseluruhan+=totalHasilResponden;

            rata2Responden=(double)totalHasilResponden/survei[i].length;
            System.out.println("Rata-rata responden ke-" + (i+1) + ": " + rata2Responden);
            System.out.println("========================================");
        }

        //untuk menghitung rata2 setiap soal
        for (int i=0;i<pertanyaan;i++) {
            int totalPersoal=0;

            for (int j=0;j<responden;j++) {
                totalPersoal+=survei[j][i];
            }
            double rata2Persoal=(double)totalPersoal/responden;
            System.out.println("Rata-rata soal ke-" + (i+1) + ": " + rata2Persoal);
        }
        
        System.out.println("========================================");
        //menghitung rata2 keseluruhan
        double rata2Keseluruhan=(double)totalKeseluruhan/responden;
        System.out.println("Rata-rata keseluruhan: " + rata2Keseluruhan);
    }
}