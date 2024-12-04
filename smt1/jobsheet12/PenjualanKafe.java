package jobsheet12;

import java.util.Scanner;


public class PenjualanKafe {
    static String[] menu={"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    public static void main(String[] args) {
        int[][] data=new int[menu.length][7];
        

        inputDataPenjualan(data, menu);
        tabelDataPejualan(data, menu);
        String penualan=menuPenjualanTertinggi(data, menu);
        System.out.println("Menu dengan total penjualan tertinggi adalah: " + penualan);
        rata2SetiapMenu(data, menu);
    }

    static void inputDataPenjualan(int[][] a, String[] b){//fungsi untuk input data penjualan
        Scanner input=new Scanner(System.in);
        System.out.println("--INPUT DATA PENJUALAN--");
        for (int i = 0; i < 7; i++) {
            System.out.println("Hari ke-" + (i+1));
            for (int j = 0; j < a.length; j++) {
                System.out.print(b[j] + ": ");
                a[j][i]=input.nextInt();
            }
            System.out.println("----------------");
        }
    }

    static void tabelDataPejualan(int[][] a, String[] b){//fungsi untuk tabel data penjualan
        System.out.println("--Tabel Data Penjualan--");
        System.out.print("\t\t");
        for (int i = 0; i < 7; i++) {
            System.out.print("Hari ke " + (i+1) + "\t");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(String.format("%-17s", b[i]));
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    static int[] totalMenu(int[][] a){//fungi untuk menghitung total setiap menu
        int[] totalPerMenu=new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                totalPerMenu[i]+=a[i][j];
            }
        }
        return totalPerMenu;
    }

    static String menuPenjualanTertinggi(int[][] a, String[] b){//fungsi untuk mencari menu dengan penjualan tertinggi
        System.out.println("--Menu Dengan Penjualan Tertinggi--");
        int[] totalPerMenu=totalMenu(a);

        int idx=0;
        int tertinggi=0;
        for (int i = 0; i < totalPerMenu.length; i++) {
            if (totalPerMenu[i]>tertinggi) {
                tertinggi=totalPerMenu[i];
                idx=i;
            }
        }
        return b[idx];
    }
    
    static void rata2SetiapMenu(int[][] a, String[] b){//fungsi menghitung rata2
        System.out.println("--Rata-rata Setiap Menu--");
        int[] totalPerMenu=totalMenu(a);

        for (int i = 0; i < totalPerMenu.length; i++) {
            double rata2=(double)totalPerMenu[i]/7;
            System.out.println("Rata-rata penjualan " + b[i] + ": " + String.format("%.1f", rata2));
        }
    }
}
