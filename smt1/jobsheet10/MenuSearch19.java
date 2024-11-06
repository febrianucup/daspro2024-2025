package jobsheet10;

import java.util.Scanner;

public class MenuSearch19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String key, hasil;

        String[] menu={"Nasi goreng", "Mie goreng", "Burger", "Es teh", "Es jeruk", "Jus alpukat", "Kentang goreng"};
        
        System.out.println("======================================");
        System.out.println("                 MENU                 ");
        System.out.println("======================================");
        
        for (String item : menu) {
            System.out.println("-" + item);
        }
        System.out.println("======================================");        

        System.out.print("Masukkan menu yang akan dicari: ");
        key=input.nextLine();
        System.out.println("======================================");

        boolean found=false;

        for (int i=0;i<menu.length;i++) {
            if (key.equalsIgnoreCase(menu[i])) {
                hasil=menu[i];
                found=true;
                System.out.println("Menu " + hasil + " tersedia");
                break;
            }
        }

        if (!found) {
            System.out.println("Menu tidak ditemukan");
        }
    }
}
