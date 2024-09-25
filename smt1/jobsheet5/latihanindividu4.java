
import java.util.Scanner;

public class latihanindividu4{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //deklarasi variabel
        System.out.print("Masukkan Umur: ");
        int umur=input.nextInt();

        if(umur<0){
            System.out.println("Input Tidak Valid");
        }else if(umur>=0 && umur<=12){
            System.out.println("Umur Dikategorikan Sebagai Anak-Anak");
        }else if(umur>=13 && umur<=19){
            System.out.println("Umur Dikategorikan Sebagai Remaja");
        }else if(umur>=20 && umur<=64){
            System.out.println("Umur Dikategorikan Sebagai Dewasa");
        }else{
            System.out.println("Umur Dikategorikan Sebagai Lansia");
        }
    }
}