import java.util.Scanner;

public class input {
    

    public static void main(String[] args) {
        Scanner objct=new Scanner(System.in);
        System.out.print("masukkan nama: ");
        String nama=objct.nextLine();

        System.out.println("nama kamu adalah " + nama);

        System.out.print("masukkan umur: ");
        int age=objct.nextInt();

        if (age>=17){
            System.out.println("kamu sudah dewasa");
        }else{
            System.out.println("kamu belum dewasa");
        }

        System.out.println("masukkan angka: ");
        int num=objct.nextInt();

        if(num%2==0){
            System.out.println("bilangan bulat");
        }else{
            System.out.println("sisa angka: " + num%2);
        }

    }
}
