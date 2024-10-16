
import java.util.Scanner;

public class GameRPG {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //variabel
        int nyawaAwalPemain, nyawaAwalMusuh, nyawaPemain, nyawaMusuh, poinPemain, poinMusuh, i=1;
        String pilih; 

        //input
        System.out.print("Masukkan nyawa awal pemain: ");
        nyawaAwalPemain=input.nextInt();
        System.out.print("Masukkan nyaw musuh: ");
        nyawaAwalMusuh=input.nextInt();
        System.out.print("Masukkan keku serangan pemain: ");
        poinPemain=input.nextInt();
        System.out.print("Masukkan kekuatan serangan musuh: ");
        poinMusuh=input.nextInt();
        input.nextLine();

        nyawaMusuh=nyawaAwalMusuh;
        nyawaPemain=nyawaAwalPemain;

        //perulangan
        do{
            System.out.println("===Round " + i + " ===");
            nyawaMusuh-=poinPemain;
            System.out.println("Pemain menyerang! Nyawa musuh tersisa: " + nyawaMusuh);
            nyawaPemain-=poinMusuh;
            if(nyawaPemain<=0){
                nyawaPemain=0;
            }
            System.out.println("Musuh menyerang! Nyawa pemain tersisa: " + nyawaPemain);

            i++;

            if(nyawaMusuh<=0){
                System.out.println("Pemain Menang");
                break;
            }else if (nyawaPemain<=0) {
                System.out.println("Pemain Kalah!");
                break;
            }

            if (nyawaPemain<=0.2*nyawaAwalPemain) {
                System.out.println("Pemain bereda dalam kondisi kritis!");
                System.out.print("Apakah Anda ingin melarikan diri? (ya/tidak): ");
                pilih=input.nextLine();
                if(pilih.equalsIgnoreCase("ya")){
                    break;
                }else if(pilih.equalsIgnoreCase("tidak")){
                    continue;
                }
            } 
        }while(nyawaMusuh>=0 || nyawaPemain>=0);
    }
}
