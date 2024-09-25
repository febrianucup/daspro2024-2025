
import java.util.Scanner;

public class percobaan1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan Sebuah Angka: ");
        int angka=input.nextInt();

        if(angka%2==0){
            System.out.println("Angka " + angka + " adalah genap");
        }else{
            System.out.println("Angka " + angka + " adalah ganjil");
        }

        String num=(angka%2==0) ? "Genap":"Ganjil";
        System.out.println(num);
    }
}
