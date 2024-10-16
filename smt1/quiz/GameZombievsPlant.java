
import java.util.Scanner;

public class GameZombievsPlant {
    public static void main(String[] args) {
        //scanner
        Scanner input=new Scanner(System.in);

        int nyawaPelindung, nyawaPenyerang, nyawaZombie, poinZombie, poinPenyerang, i=0;
        
        //input
        System.out.println("Zombie vs Plant");
        System.out.println("----------------");
        System.out.println("Status Awal Pertarungan:");
        System.out.print("Nyawa Zombie: ");
        nyawaZombie=input.nextInt();
        System.out.print("Poin Serangan Zombie: ");
        poinZombie=input.nextInt();
        System.out.print("Nyawa Tanaman Pelindung: ");
        nyawaPelindung=input.nextInt();
        System.out.print("Nyawa Tanaman Penyerang: ");
        nyawaPenyerang=input.nextInt();
        System.out.print("Poin Serangan Tanaman Penyerang: ");
        poinPenyerang=input.nextInt();
        System.out.println("-----------------");
        System.out.println("Pertarungan: Tanaman vs Zombie");
        System.out.println("-----------------");

        //perulangan
        while (nyawaPenyerang>=0 && nyawaZombie>=0){
            System.out.println();
            System.out.println("Round " + (i+1));
            System.out.println("-------------");
            
            //pertarugan
            System.out.println("Tanaman Penyerang menyerang Zombie");
            nyawaZombie-=poinPenyerang;
            System.out.println("Nyawa Zombie Sekarang: " + nyawaZombie);
            System.out.println("Zombie menyerang Tanaman Pelindung");
            
            if(nyawaPelindung>=0){
                nyawaPelindung-=poinZombie;
                System.out.println("Nyawa Tanaman Pelindung Sekarang: " + nyawaPelindung);
            }else if(nyawaPelindung<=0){
                nyawaPenyerang-=poinZombie;
                System.out.println("Nyawa Tanaman Penyerang: " + nyawaPenyerang);
            }
            if(nyawaPenyerang<=0){
                System.out.println("Tanaman telah hancur! Zombie menang!");
                break;
            }else if(nyawaZombie<=0){
                System.out.println("Zombie telah kalah! Tanaman menang!");
                break;
            }
            i++;
        }
    }
}
