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

        //deklarasi variabel
        String nilaiHuruf, kualifikasi;

        //pengecakan nilai dengan huruf dan kualifikasi nilai
        if(nilaiAkhir >80 && nilaiAkhir<=100){
            nilaiHuruf="A";
            kualifikasi="Sangat Baik";
        }else if(nilaiAkhir >73 && nilaiAkhir<=80){
            nilaiHuruf="B+";
            kualifikasi="Lebih dari Baik";
        }else if(nilaiAkhir>65 && nilaiAkhir<=73){
            nilaiHuruf="B";
            kualifikasi="Baik";
        }else if(nilaiAkhir >60 && nilaiAkhir<=65){
            nilaiHuruf="C+";
            kualifikasi="Lebih dari Cukup";
        }else if(nilaiAkhir>50 && nilaiAkhir<=60){
            nilaiHuruf="C";
            kualifikasi="Cukup";
        }else if(nilaiAkhir>39 && nilaiAkhir<=50){
            nilaiHuruf="D";
            kualifikasi="Kurang";
        }else {
            nilaiHuruf="E";
            kualifikasi="Gagal";
        }

        //output
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
            
        
}
}