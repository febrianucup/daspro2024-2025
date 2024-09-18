
import java.util.Scanner;


public class touring {
    public static void main(String[] args) {
        //scanner
        Scanner input=new Scanner(System.in);

        //deklarasi variabel
        double konsumsi_bahan_bakar_tol,konsumsi_bahan_bakar_pegunungan, konsumsi_bahan_bakar_perkotaan, kecepatan_tol, kecepatan_perkotaan, kecepatan_pegunungan, durasi_tol, durasi_perkotaan, durasi_pegunungan, kapasitas_mesin, faktor_lingkungan_tol, faktor_lingkungan_perkotaan, faktor_lingkungan_pegunungan, total_konsumsi_setiap_segmen, rata_konsumsi_bahan_bakar, target_penggunaan_bahan_bakar, persentase_konsumsi_bahan_bakar, total_kecepatan, total_durasi, total_jarak;

        //input data faktor lingkungan setiap segmen
        faktor_lingkungan_pegunungan=0.7;
        faktor_lingkungan_perkotaan=0.5;
        faktor_lingkungan_tol=0.3;

        //input data kapasitas mesin
        System.out.print("Masukkan kapasitas mesin: ");
        kapasitas_mesin=input.nextDouble();

        //enter
        System.out.println("");

        //konsumsi bahan bakar setiap segmen
        System.out.println("--Konsumsi bahan bakar setiap segmen--");
        //konsumsi bahan bakar area tol
        System.out.println("--Segmen Tol--");
        //input data
        System.out.print("Masukkan Kecepatan: ");
        kecepatan_tol=input.nextDouble();
        System.out.print("Masukkan Durasi: ");
        durasi_tol=input.nextDouble();
        //menghitung bahan bakar area tol
        konsumsi_bahan_bakar_tol=((kecepatan_tol*durasi_tol)/100)*kapasitas_mesin *faktor_lingkungan_tol;
        System.out.println("Konsumsi bahan bakar pada segmen tol adalah " + konsumsi_bahan_bakar_tol + "liter");

        //enter
        System.out.println("");

        //konsumsi bahan bakar area perkotaan
        System.out.println("--Segmen Perkotaan--");
        //input data
        System.out.print("Masukkan Kecepatan: ");
        kecepatan_perkotaan=input.nextDouble();
        System.out.print("Masukkan Durasi: ");
        durasi_perkotaan=input.nextDouble();
        //menghitung bahan bakar area perkotaan
        konsumsi_bahan_bakar_perkotaan=((kecepatan_perkotaan*durasi_perkotaan)/100)*kapasitas_mesin *faktor_lingkungan_perkotaan;
        System.out.println("Konsumsi bahan bakar pada segmen perkotaan adalah " + konsumsi_bahan_bakar_perkotaan + "liter");

        //enter
        System.out.println("");

        //konsumsi bahan bakar area pegunungan
        System.out.println("--Segmen Pegunungan--");
        //input data
        System.out.print("Masukkan Kecepatan: ");
        kecepatan_pegunungan=input.nextDouble();
        System.out.print("Masukkan Durasi: ");
        durasi_pegunungan=input.nextDouble();
        //menghitung bahan bakar area pegunungan
        konsumsi_bahan_bakar_pegunungan=((kecepatan_pegunungan*durasi_pegunungan)/100)*kapasitas_mesin *faktor_lingkungan_pegunungan;
        System.out.println("Konsumsi bahan bakar pada segmen pegunungan adalah " + konsumsi_bahan_bakar_pegunungan + "liter");

        //enter
        System.out.println("");

        //total konsumsi bahan bakar dari semua segmen
        System.out.println("--Total Konsumsi Bahan Bakar--");
        //menghitung total bahan bakar
        total_konsumsi_setiap_segmen=konsumsi_bahan_bakar_pegunungan+konsumsi_bahan_bakar_perkotaan+konsumsi_bahan_bakar_tol;
        System.out.println("Total konsumsi bahan bakar setiap segmen adalah " + total_konsumsi_setiap_segmen + "liter");

        //enter
        System.out.println("");

        //input total jarak
        //total kecepatan
        total_kecepatan=kecepatan_pegunungan+kecepatan_perkotaan+kecepatan_tol;
        //total durasi
        total_durasi=durasi_pegunungan+durasi_perkotaan+durasi_tol;
        //total jarak
        total_jarak=(total_kecepatan*total_durasi)/100;

        //rata-rata konsumsi bahan bakar
        System.out.println("--Rata Rata Konsumsi Bahan Bakar--");
        //menghitung rata-rata
        rata_konsumsi_bahan_bakar=total_konsumsi_setiap_segmen/total_jarak;
        System.out.println("Rata rata konsumsi bahan bakar adalah " + String.format("%.2f", rata_konsumsi_bahan_bakar) + "liter/km");

        //jarak
        System.out.println("");

        //persentase konsumsi bahan bakar dari target
        System.out.println("--Persentase Konsumsi Bahan Bakar Dari Target--");
        //input data
        System.out.print("Masukkan target: ");
        target_penggunaan_bahan_bakar=input.nextDouble();
        //menghitung persentase
        persentase_konsumsi_bahan_bakar=(total_konsumsi_setiap_segmen/target_penggunaan_bahan_bakar)*100/100f;
        System.out.println("Persentase konsumsi bahan bakar dari taeger adalah " + persentase_konsumsi_bahan_bakar + "%");
    }
}
