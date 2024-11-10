package jobsheet11;
import java.util.Scanner;

public class BioskoWScanner19 {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    String nama, next;
    String daftarnama="";
    int baris,kolom, opsiMenu;
    final String[][] penonton=new String[4][2];
    
    do {
        System.out.println("Opsi Menu:\n 1. Input Data Penonton\n 2. Daftar Penonton\n 3. Exit"); 
        System.out.print("Opsi Menu: ");
        opsiMenu=input.nextInt();
        input.nextLine();

        while (true) { 
            if (opsiMenu==1) {
                System.out.print("Masukkan nama: ");
                nama=input.nextLine();
                System.out.print("Masukkan baris: ");
                baris=input.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom=input.nextInt();
                input.nextLine();

                if (true) {
                    boolean kursiTerisi=false;
                    if (penonton[baris-1][kolom-1]==null) {
                        penonton[baris-1][kolom-1]=nama;
                        System.out.println("Kursi berasil dipesan");
                        kursiTerisi=true;            
                    }
                
                    if (!kursiTerisi) {
                        System.out.println("Kursi telah terisi silahkan input ulang!");
                        continue;
                    }
                }

                System.out.print("Input penonton lainnya? (y/n)");
                next=input.nextLine();
    
                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            }else if (opsiMenu==2) {
                System.out.println("Daftar Penonton: ");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        daftarnama=penonton[i][j];
                        
                        if(daftarnama!=null){
                            System.out.println("-" + daftarnama);
                        }
                        if (daftarnama==null) {
                            System.out.println("-" + "***");
                        }  
                    }
                    
                } 
                break;
            }else if (opsiMenu==3) {
                System.out.println("Exit");
                break;
            }else{
                System.out.println("Inputan invalid silahkan input menu ulang!");
                continue;
            }
        }
    }while(opsiMenu!=3);
  }
}
