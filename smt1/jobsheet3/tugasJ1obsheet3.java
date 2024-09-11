
import java.util.Scanner;


public class tugasJ1obsheet3 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Total Penggunaan Listrik: ");
        int totalListrik=sc.nextInt();
        double tagihan=1500;

        //total tagihan
        double totalTagihan=totalListrik*tagihan;

        //eksekusi
        if(totalListrik>500){
            System.out.println("listrik kamu melebihi 500 kWH");
        }else{
            System.out.println("listrik kamu tidak melebihi 500 kWh");
        }
        System.out.println("Total Tagihan Listrik adalah Rp. " + totalTagihan);
        
    }
}
