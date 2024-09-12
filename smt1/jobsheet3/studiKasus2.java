import java.util.Scanner;

public class studiKasus2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //input keanggotaan, jumlah kopi, jumlah teh, dan jumlah roti, harga jual, diskon
        boolean keanggotaan;
        int jmlhKopi, jmlhTeh, jmlhRoti;
        double hargaKopi=12000, hargaTeh=7000, hargaRoti=20000;
        float diskon=10/100f;

        System.out.print("Masukkan keanggotaan (true/false): " );
        keanggotaan=sc.nextBoolean();
        System.out.print("Masukkan jumlah kopi: ");
        jmlhKopi=sc.nextInt();
        System.out.print("Masukkan jumlah teh: ");
        jmlhTeh=sc.nextInt();
        System.out.print("Masukkan jumlah roti: ");
        jmlhRoti=sc.nextInt();

        //Hitung total harga
        double totalHarga=(jmlhKopi*hargaKopi) + (jmlhTeh*hargaTeh) + (jmlhRoti*hargaRoti);
        byte totalByte= (byte)totalHarga;

        //Nominal Bayar
        double nominalBayar=totalHarga-(diskon*totalHarga);
        int nominalInt=(int) nominalBayar;

        //output
        System.out.println("Item pembelian " + jmlhKopi + " kopi, " + jmlhTeh + " teh, " + jmlhRoti + " roti.");
        System.out.println("Nominal Bayar adalah Rp. " + nominalBayar);
        System.out.println("Nominal Int adalah Rp. " + nominalInt);
        System.out.println("totalByte: " + totalByte);
        System.out.println(totalHarga);
    }
}
