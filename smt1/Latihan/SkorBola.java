package Latihan;

import java.util.Scanner;

public class SkorBola {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //input jumlah tim
        System.out.print("Masukkan jumlah tim: ");
        int jmlhTim=input.nextInt();
        input.nextLine();

        //array skor
        int[][] skor=new int[jmlhTim][jmlhTim];
        String[] namaTim=new String[jmlhTim];
        int[] skorPerTim=new int[jmlhTim];

        //input nama tim
        for (int i = 0; i < namaTim.length; i++) {
            System.out.print("Nama tim " + (i+1) + ": ");
            namaTim[i]=input.nextLine();
        }
        System.out.println();
        //input skor pertandingan
        int inputSkor;
        System.out.println("Masukkan skor pertandingan: ");
        for (int i = 0; i < skor.length; i++) {
            for (int j = 1; j < skor.length; j++) {
                if (i==j) {
                    break;
                }
                System.out.print(namaTim[i] + " vs " + namaTim[j] + ", skor: ");
                inputSkor=input.nextInt();

                skor[i][j]+=inputSkor;
                skor[j][i]+=(-inputSkor);
            }       
        }
        System.out.println();
        //tabel skor
        System.out.println("Tabel skor pertandingan: ");
        System.out.print("\t");
        for (String tim : namaTim) {
            System.out.print(tim + "\t");
        }
        System.out.println();
        for (int i = 0; i < skor.length; i++) {
            System.out.print(namaTim[i] + "\t");
            for (int j = 0; j < skor.length; j++) {
                System.out.print(skor[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        //total skor tiap tim
        for (int i = 0; i < skor.length; i++) {
            int totalSKor=0;
            for (int j = 0; j < skor[i].length; j++) {
                totalSKor+=skor[i][j];
            }
            skorPerTim[i]+=totalSKor;
            System.out.println(namaTim[i] + " total skor " + skorPerTim[i]);
        }
        System.out.println();
        //pemimpin klasemen
        int idxTop=0;
        int poinTertinggi=0;
        for (int i = 0; i < skorPerTim.length; i++) {
            if(skorPerTim[i]>poinTertinggi){
                poinTertinggi=skorPerTim[i];
                idxTop=i;
            }
        }
        System.out.println("Pemimpin klasemen: " + namaTim[idxTop]);
    }
}
