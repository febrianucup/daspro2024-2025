
import java.util.Scanner;

public class casircafe {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
   
        boolean keanggotaan;
        int jumlah; 
        double nominal_bayar, diskon, totalHarga;
        char ukuran_cup;
        double harga_menu=0;

        
        
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan=input.nextBoolean();
        System.out.print("Masukkan menu: ");
        String menu=input.nextLine();
        System.out.print("Masukkan jumlah: ");
        jumlah=input.nextInt();
        System.out.print("Masukkan ukuran cup (S/M/L): ");
        ukuran_cup=input.next().charAt(0);

        switch (menu.toLowerCase()) {
            case "kopi":
                harga_menu=12000;
            case "teh":
                harga_menu=7000;
            case "coklat":
                harga_menu=20000;
                break;
            default :
                System.out.println("tidak ada dalam menu");
        }

        totalHarga=(harga_menu*jumlah);
        
        switch (ukuran_cup) {
            case 'S':
                break;
            case 'M':
                totalHarga+=0.25*totalHarga;
                break;
            case 'L':
                totalHarga+=0.4*totalHarga;
                break;
        }

        diskon=(keanggotaan)?0.1:0;
        nominal_bayar=totalHarga-(diskon*totalHarga);

        System.out.println(nominal_bayar);
    }
}
