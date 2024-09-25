import java.util.Scanner;

public class siakad_19{

    public static void main(String[] args){
        //deklarasi scanner
        Scanner sc=new Scanner(System.in);

        //deklarasi input dan varaibel biodata
        System.out.print("Masukkan Nama Anda: ");
        String nama=sc.nextLine();
        System.out.print("Masukkan NIM Anda: ");
        String NIM=sc.nextLine();
        System.out.print("Masukkan Kelas Anda: ");
        char kelas=sc.nextLine().charAt(0);
        System.out.print("No. Absen: ");
        byte absen=sc.nextByte();

        //deklarasi input dan varaibel nilai
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

        //menghitung nilai akhir dan bobot
        double nilaiAkhir=(nilaiKuis+nilaiTugas+nilaiUjian)/3;
        double nilaiAkhirBobot=(nilaiKuis*20/100) + (nilaiTugas*15/100) + (nilaiUts*30/100) + (nilaiUas*35/100); 

        //print biodata dan niulai
        System.out.println("Nama: " + nama + " " + "NIM: " + NIM);
        System.out.println("Kelas: " + kelas + " " + "Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Akhir Dengan Bobot: " + nilaiAkhirBobot);

        //pengecakan nilai dengan huruf dan kualifikasi nilai
        if(nilaiAkhir >80 && nilaiAkhir<=100){
            System.out.println("Nilai Huruf: A");
            System.out.println("Kualifikasi: sangat baik");
        }else if(nilaiAkhir >73 && nilaiAkhir<=80){
            System.out.println("Nilai Huruf: B+");
            System.out.println("Kualifikasi: Lebih dari baik");
        }else if(nilaiAkhir>65 && nilaiAkhir<=73){
            System.out.println("Nilai Huruf: B");
            System.out.println("Kualifikasi: Baik");
        }else if(nilaiAkhir >60 && nilaiAkhir<=65){
            System.out.println("Nilai Huruf: C+");
            System.out.println("Kualifikasi: Lebih dari cukup");
        }else if(nilaiAkhir>50 && nilaiAkhir<=60){
            System.out.println("Nilai Huruf: C");
            System.out.println("Kualifikasi: Cukup");
        }else if(nilaiAkhir>39 && nilaiAkhir<=50){
            System.out.println("Nilai Huruf: D");
            System.out.println("Kualifikasi: Kurang");
        }else if(nilaiAkhir<=39){
            System.out.println("Nilai Huruf: E");
            System.out.println("Kualifikasi: Gagal");
        }
            
        
}
}