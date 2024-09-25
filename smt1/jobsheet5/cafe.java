
import java.util.Scanner;

public class cafe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc= new Scanner(System.in);

        boolean keanggotaan;
        int jumlah;
        double nominal_bayar, diskon, totalHarga;
        char ukuran_cup;
        String menu;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan menu: ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup (S/M/L): ");
        ukuran_cup = input.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = input.nextInt();
        

        double harga_menu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                harga_menu = 12000;
                break;
            case "teh":
                harga_menu = 7000;
                break;
            case "coklat":
                harga_menu = 20000;
                break;

        }

        totalHarga = (harga_menu * jumlah);

        switch (ukuran_cup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("Size yang dipilihh tidak tersedia");
        }

        diskon = (keanggotaan) ? 0.1 : 0;
        nominal_bayar = totalHarga - (diskon * totalHarga);

        System.out.println(nominal_bayar);
    }
}
