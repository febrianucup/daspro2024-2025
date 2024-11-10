package jobsheet11;

import java.util.Scanner;

public class Siakad19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //input jumlah siswa dan jumlah mata kuliah
        System.out.print("Input jumlah mahasiswa: ");
        int mahasiswa=input.nextInt();
        System.out.print("Input jumlah mata kuliah: ");
        int matkul=input.nextInt();

        int[][] nilai=new int[mahasiswa][matkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai Mahasiswa ke-" + (i+1));
            double totalPersiswa=0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai[i][j]=input.nextInt();
                totalPersiswa+=nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPersiswa/nilai[i].length);
        }

        for (int j = 0; j < matkul; j++) {
            double totalPermatkul=0;
            for (int i= 0; i < mahasiswa; i++) {
                totalPermatkul+=nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j+1) + ": " + totalPermatkul/nilai.length);
        }
    }
}
