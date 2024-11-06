package jobsheet9;

import java.util.Scanner;

public class Porseni {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String cabor="";
        
        System.out.print("Masukkan jumlah Politeknik yang mengikuti PORSENi:");
        int jumlahPoltek=input.nextInt();
        input.nextLine();

        //perulangan jumlah poluiteknik
        for(int x=1;x<=jumlahPoltek;x++){
            System.out.println("Politeknik ke-" + x);
            //perulangan cabor
            for (int i=1;i<=4;i++){
                switch (i) {
                    case 1:cabor="Badminton";
                            break;
                    case 2:cabor="Tenis Meja";
                            break;
                    case 3:cabor="Basket";
                            break;
                    case 4:cabor="Bola Voly";
                            break;
                }
                System.out.println("Informasi atlet cabor " + cabor + ":");
                //perulangan nama atlet
                for(int j=1;j<=5;j++){
                    System.out.print("Nama atlet ke-" + j + ":");
                    String nama=input.nextLine();
                }
            }
        } 
    }
}