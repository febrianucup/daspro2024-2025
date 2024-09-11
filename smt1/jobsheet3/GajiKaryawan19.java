import java.util.Scanner;

public class GajiKaryawan19 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double jmlhJamKerja, upahPerjam, bonus, pajak, gajiBulanan, totalBonus, totalGajiPajak, gajiPlusBonus, gajiBersih; 
        
        System.out.print("Jumlah Jam Kerja: ");
        jmlhJamKerja=sc.nextDouble();
        System.out.print("Upah Per Jam: ");
        upahPerjam=sc.nextDouble();
        bonus=10/100f;
        pajak=5/100f;
        //eksekusi
        gajiBulanan=jmlhJamKerja*upahPerjam;
        totalBonus=gajiBulanan*bonus;
        gajiPlusBonus=gajiBulanan+totalBonus;
        totalGajiPajak=gajiBulanan*pajak;
        gajiBersih=gajiPlusBonus-totalGajiPajak;

        System.out.println("Total Gajimu bulan ini adalah "+(String.format("%.2f", gajiBersih)));
        sc.close();
        
    }
    
}
