import java.util.Scanner;

public class tugas2jobsheet3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double jmlhJamKerja, upahPerjam, bonus, pajak, gajiBulanan, totalBonus, totalGajiPajak; 
        
        System.out.print("Jumlah Jam Kerja: ");
        jmlhJamKerja=sc.nextDouble();
        System.out.print("Upah Per Jam: ");
        upahPerjam=sc.nextDouble();
        bonus=10/100f;
        pajak=5/100f;
        //eksekusi
        gajiBulanan=jmlhJamKerja*upahPerjam;
        totalBonus=gajiBulanan*bonus;
        gajiBulanan+=totalBonus;
        totalGajiPajak=gajiBulanan*pajak;
        gajiBulanan-=totalGajiPajak;

        System.out.println("Total Gajimu bulan ini adalah"+(String.format("%.2f", gajiBulanan)));

    }
    
}
