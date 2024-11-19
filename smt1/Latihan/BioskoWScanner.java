package Latihan;
import java.util.Scanner;

public class BioskoWScanner {
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
                
                do { 
                    System.out.println("Nomor Baris 1-4");
                    System.out.print("Masukkan baris: ");
                    baris=input.nextInt();
                    if(baris<=0 || baris>4){
                        System.out.println("Nomor Baris tidak tersedia, silahkan input ulang!!");
                    }
                } while (baris<=0 || baris>4);

                do { 
                    System.out.println("Nomor Kolom 1-2");
                    System.out.print("Masukkan kolom: ");
                    kolom=input.nextInt();
                    if(kolom<=0 || kolom>2){
                        System.out.println("Nomor Kolom tidak tersedia, silahkan input ulang!!");
                    }
                } while (kolom<=0 || kolom>2);

                penonton[baris-1][kolom-1]=nama;

                input.nextLine();

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
                    }
                    
                }
                System.out.print("\t");
                for (int i = 0; i < penonton[i].length; i++) {
                    System.out.print((i+1) + "\t");
                } 
                System.out.println();
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print((i+1) + "\t");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j]==null) {
                            System.out.print("Kosong\t");
                        }else{
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
                break;
            }else if (opsiMenu==3) {
                System.out.println("Exit");
                break;
            }else{
                System.out.println("Inputan invalid silahkan input menu ulang!");
                break;
            }
        }
    }while(opsiMenu!=3);
  }
}

