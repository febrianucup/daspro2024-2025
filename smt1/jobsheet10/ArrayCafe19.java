package jobsheet10;

import java.util.Scanner;

public class ArrayCafe19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //deklarasi variable
        int jmlhPesan, j=0, totalHarga=0;

        //input
        System.out.print("Masukkan jumlah pesanan: ");
        jmlhPesan=input.nextInt();
        input.nextLine();

        int[] harga=new int[jmlhPesan];
        String[] menu=new String[jmlhPesan];
        
        for (int i=0;i<menu.length;i++) {
            System.out.print("Masukkan menu ke-" + (i+1) + ": ");
            menu[i]=input.nextLine();
            while(j<=i){
                System.out.print("Masukkan harga menu ke-" + (j+1) + ": ");
                harga[j]=input.nextInt();
                input.nextLine();
                System.out.println("================================");

                j++;
            }
        }

        for (int i=0;i<harga.length;i++) {
            totalHarga+=harga[i];
        }

        for (int i=0;i<menu.length;i++) {
            System.out.println("Menu ke-" + (i+1) + ": " + menu[i]);
        }

        System.out.println("================================");
        System.out.print("Total harga: " + totalHarga);

    }
}
