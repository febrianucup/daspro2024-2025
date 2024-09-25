
import java.util.Scanner;

public class percobaan1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int angka=input.nextInt();

        if(angka%2==0){
            System.out.println("Angka " + angka + " adalah ganjil");
        }else{
            System.out.println("Angka " + angka + " adalah genap");
        }
    }
}
