
import java.util.Scanner;

public class studiKasus1 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan Nama Anda: ");
        String nama=sc.nextLine();
        System.out.print("Masukkan NIM Anda: ");
        String NIM=sc.nextLine();
        System.out.print("Masukkan Kelas Anda: ");
        char kelas=sc.nextLine().charAt(0);
        System.out.print("No. Absen: ");
        byte absen=sc.nextByte();

        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis=sc.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas=sc.nextDouble();
        System.out.print("Masukkan Nilai Ujian: ");
        double nilaiUjian=sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUts=sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUas=sc.nextDouble();

        double nilaiAkhir=(nilaiKuis+nilaiTugas+nilaiUjian)/3;
        double nilaiAkhirBobot=(nilaiKuis*20/100) + (nilaiTugas*15/100) + (nilaiUts*30/100) + (nilaiUas*35/100); 

        System.out.println("Nama: " + nama + " " + "NIM: " + NIM);
        System.out.println("Kelas: " + kelas + " " + "Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Akhir Dengan Bobot: " + nilaiAkhirBobot);


    }
}
