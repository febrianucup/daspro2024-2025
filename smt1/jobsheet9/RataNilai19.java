package jobsheet9;

import java.util.Scanner;

public class RataNilai19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int i, j;
        float nilai, totalNilai, rataNilai;

        i=1;
        while(i<=5){
            System.out.println("Input nilai mahasiswa ke-" + i);
            totalNilai=0;
            j=1;
            while(j<=5){
                System.out.print("Input Nilai: ");
                nilai=input.nextFloat();
                totalNilai+=nilai;
                j++;
            }
            rataNilai=totalNilai/5f;
            System.out.println("Rata-rata Nilai: "+rataNilai);
            i++;        
        }
    }
}
