package Latihan;

import java.util.Scanner;

public class SistemAbsensi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //input jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jmlhSiswa=input.nextInt();
        input.nextLine();

        //array
        String[][] dataAbsensi=new String[jmlhSiswa][6];
        String[] hari={"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        String[] namaSiswa=new String[jmlhSiswa];

        //input nama siswa
        System.out.println("--Input nama siswa--");
        for (int i = 0; i < dataAbsensi.length; i++) {
            System.out.print("Mahasiswa " + (i+1) + ": ");
            namaSiswa[i]=input.nextLine();
        }

        //data kehadiran
        System.out.println("--Data kehadiran--");
        System.out.println("Input H=Hadir, TH=Tidak Hadir");
        for (int i = 0; i < hari.length; i++) {
            System.out.println("Hari " + hari[i] + ": ");
            for (int j = 0; j < namaSiswa.length; j++) {
                System.out.print(namaSiswa[j] + ": ");
                String dataHadir=input.nextLine();

                dataAbsensi[j][i]=dataHadir;
            }
            System.out.println("-------------------");
        }

        System.out.println();

        //tabel kehadiran
        System.out.println("Tabel kehadiran:");
        System.out.println("Keterangan: H=Hadir, TH=Tidak Hadir");
        System.out.print("\t");
        for (int i = 0; i < hari.length; i++) {
            System.out.print(hari[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.print(namaSiswa[i] + "\t");
            for (int j = 0; j < dataAbsensi[i].length; j++) {
                System.out.print(dataAbsensi[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //akumalasi jumlah absen tiap siswa
        System.out.println("--Akumulasi absensi setiap siswa--");
        int hadir=0;
        int tidakHadir=0;

        for (int i = 0; i < dataAbsensi.length; i++) {
            hadir=0;
            tidakHadir=0;
            for (int j = 0; j < dataAbsensi[i].length; j++) {
                if (dataAbsensi[i][j].equalsIgnoreCase("H")) {
                    hadir+=1;
                }else if (dataAbsensi[i][j].equalsIgnoreCase("TH")) {
                    tidakHadir+=1;
                }
            }
            System.out.println(namaSiswa[i]);
            System.out.println("Hadir: " + hadir);
            System.out.println("Tidak Hadir: " + tidakHadir);
        }

        System.out.println();

        //siswa yang tidak hadir lebih dari 3 kali
        boolean absen=false;
        System.out.println("Siswa yang tidak hadir selama lebih dari 3 hari: ");
        for (int i = 0; i < dataAbsensi.length; i++) {
            hadir=0;
            tidakHadir=0;
            for (int j = 0; j < dataAbsensi[i].length; j++) {
                if (dataAbsensi[i][j].equalsIgnoreCase("H")) {
                    hadir+=1;
                }else if (dataAbsensi[i][j].equalsIgnoreCase("TH")) {
                    tidakHadir+=1;
                }
            }
            if (tidakHadir>3) {
                absen=true;
                System.out.println("-" + namaSiswa[i]);
            }
        }
        if (!absen) {
            System.out.println("Tidak ada");
        }
    }
}
