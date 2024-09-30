package jobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan3 {
    public static void main(String[] args) {
        //scanner
        Scanner input=new Scanner(System.in);

        //deklarasi variabel
        String kategori;
        int penghasilan, gaji_bersih;
        double pajak;

        //input
        System.out.print("Masukkan Kategori= ");
        kategori=input.nextLine().toLowerCase();
        System.out.print("Masukkan Jumlah Penghasilan= ");
        penghasilan=input.nextInt();

        //pemilihan
        if(kategori.equals("pekerja")){
            if(penghasilan<=2000000){
                pajak=0.1;
            }else if(penghasilan<=3000000){
                pajak=0.15;
            }else{
                pajak=0.2;
            }
        }else if(kategori.equals("pebisnis")){
            if(penghasilan<=2500000){
                pajak=0.15;
            }else if(penghasilan<3500000){
                pajak=0.2;
            }else{
                pajak=0.25;
            }
        }else{
            System.out.println("Kategori Salah");
            return;
        }

        //menghitung gaji bersih
        gaji_bersih=(int)(penghasilan-(penghasilan*pajak));

        //output
        System.out.println("Gaji Bersih= " + gaji_bersih);
    }
}
