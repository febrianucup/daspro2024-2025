package jobsheet10;

import java.util.Scanner;

public class ArrayNilai19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] nilaiAkhir=new int[10];

        //looping
        for(int i=0;i<nilaiAkhir.length;i++){
            System.out.print("Masukkan nilai akhir ke-" + i + ": ");
            nilaiAkhir[i]=input.nextInt();
        }

        for(int i=0;i<10;i++){
            if (nilaiAkhir[i]>70) {
                System.out.println("Nilai akhir ke-" + i + "Lulus");
            }else{
                System.out.println("Nilai akhir ke-" + i + "Tidak Lulus");
            }
            
        }
    }
}
