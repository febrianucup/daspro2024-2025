package jobsheet10;

import java.util.Scanner;

public class ArrayRatanilai19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //deklarasi variable
        System.out.print("Masukkan jumlah mahasiswa: ");
        int inputNilai=input.nextInt();

        int[] nilaiMhs=new int[inputNilai];
        int totalLulus=0, totalTidakLulus=0;
        double rata2Lulus, rata2TidakLulus, jumlahLulus=0, jumlahTidakLulus=0;

        for(int i=0;i<nilaiMhs.length;i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMhs[i]=input.nextInt();
        }
        
        

        for(int i=0;i<nilaiMhs.length;i++){
            if(nilaiMhs[i]>70){
                totalLulus+=nilaiMhs[i];
                jumlahLulus+=1;
            }else{
                totalTidakLulus+=nilaiMhs[i];
                jumlahTidakLulus+=1;
            }
        }

        rata2Lulus=totalLulus/jumlahLulus;
        rata2TidakLulus=totalTidakLulus/jumlahTidakLulus;
        System.out.println("Rata-rata mahasiswa yang lulus: " + rata2Lulus);
        System.out.println("Rata-rata mahasiswa yang tidak lulus: " + rata2TidakLulus);
    }
}
