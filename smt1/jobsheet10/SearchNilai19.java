package jobsheet10;

import java.util.Scanner;

public class SearchNilai19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai: ");
        int jumlahNilai = input.nextInt();

        int[] arrNilai = new int[jumlahNilai];
        int key;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = input.nextInt();

        boolean found = false;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                System.out.println("Nilai " + key + " ditemukan pada nilai Mahasiswa ke-" + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Nilai tidak ditemukan");
        }
    }
}