
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

        double nilaiAkhir=(nilaiKuis+nilaiTugas+nilaiUjian)/3;

        System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}
