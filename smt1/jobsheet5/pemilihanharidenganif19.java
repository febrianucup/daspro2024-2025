
import java.util.Scanner;

public class pemilihanharidenganif19 {
    public static void main(String[] args) {
        //deklarasi scanner
        Scanner sc=new Scanner(System.in);

        //deklarasi variabel dan inputan
        System.out.print("Masukkan Angka: ");
        int angka=sc.nextInt();

        //pengecekan jika input=1,2,3,4,5 yang ditampilkan adalah "weekday" sedangkan input=5,6 yang ditampilkan adalah "weekend"
        if(angka>=1 && angka<=5){
            System.out.println("Weekday");
        }else if(angka==6 && angka==7){
            System.out.println("Weekend");
        }else{
            System.out.println("Invalid Number");
        }
    }
}
