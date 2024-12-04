package jobshet14;

import java.util.Scanner;

public class Tugas3 {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        int N=inputN();
        int[] num=new int[N];

        System.out.println("--Rekursif--");
        int total=totalNilaiRekursif(N-1, num);
        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + total);
        System.out.println();
        N=inputN();
        System.out.println("--Iteratif--");
        int totalIteraif=totalNilaiIteratif(N-1, num);
        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + totalIteraif);
    }

    static int inputN(){
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n=input.nextInt();
        return n;
    }

    static int totalNilaiRekursif(int a, int[] b){
        if (a>=0) {
            System.out.print("Masukkan nilai ke-" + (a+1) + ": ");
            int count=input.nextInt();
            return count + totalNilaiRekursif(a-1, b);
        }else{
            return 0;
        }
    }

    static int totalNilaiIteratif(int a, int[] b){
        int count=0;
        for (int i = a; i >= 0; i--) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            int num=input.nextInt();
            count+=num;
        }
        return count;
    }
}
