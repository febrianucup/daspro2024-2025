package jobsheet12;

public class ProgramKu19 {
    public static void TampilHiggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.println(j);
        }
    }

    public static int Jumlah(int bil1, int bil2){
        return(bil1+bil2);
    }

    public static void TampilJumlah(int bil1, int bil2){
        TampilHiggaKei(Jumlah(bil1, bil2));
    }

    public static void main(String[] args) {
        int temp=Jumlah(1, 1);
        TampilJumlah(temp, 5);
    }
}
