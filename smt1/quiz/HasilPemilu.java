
import java.util.Scanner;

public class HasilPemilu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input jumlah wilayah dan calon PILKADA
        System.out.print("Input Jumlah Wilayah: ");
        int jmlhWil = input.nextInt();
        System.out.print("Input Jumlah Calon PILKADA: ");
        int jmlhCal = input.nextInt();
        input.nextLine();

        //Array
        String[] wilayah = new String[jmlhWil];
        String[] namaCalon = new String[jmlhCal];
        int[][] suara = new int[jmlhWil][jmlhCal];

        //input wilayah dan nama calon
        System.out.println("Input Nama Wilayah: ");
        for (int i = 0; i < wilayah.length; i++) {
            System.out.print("Wilayah ke-" + (i + 1) + ": ");
            wilayah[i] = input.nextLine();
        }
        System.out.println("Input Nama Calon: ");
        for (int i = 0; i < namaCalon.length; i++) {
            System.out.print("Nama Calon ke-" + (i + 1) + ": ");
            namaCalon[i] = input.nextLine();
        }

        System.out.println("---------------------");

        //input data hasil pemilu setiap daerah
        for (int i = 0; i < suara.length; i++) {
            System.out.println(wilayah[i]);
            for (int j = 0; j < suara[i].length; j++) {
                System.out.print(namaCalon[j] + ": ");
                suara[i][j] = input.nextInt();
            }
            System.out.println("---------------------");
        }

        //tabel hasil data
        System.out.println("Tabel Hasil Pemungutan Suara: ");
        System.out.print("\t");
        for (int i = 0; i < suara.length; i++) {
            System.out.print(wilayah[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < namaCalon.length; i++) {
            System.out.print(namaCalon[i] + "  ");
            for (int j = 0; j < wilayah.length; j++) {
                System.out.print("\t" + suara[j][i]);
            }
            System.out.println();
        }

        System.out.println("---------------------");

        //persentase hasil suara
        double totalSuara = 0;
        double suaraPerCal[] = new double[jmlhCal];
        for (int i = 0; i < namaCalon.length; i++) {
            for (int j = 0; j < wilayah.length; j++) {
                suaraPerCal[i] += suara[j][i];
            }
            totalSuara += suaraPerCal[i];
        }

        for (int i = 0; i < namaCalon.length; i++) {
            double persentaseCalon = (suaraPerCal[i] / totalSuara) * 100;
            System.out.println(namaCalon[i] + ": " + String.format("%2f", persentaseCalon) + "%");
        }

        System.out.println("---------------------");

        //wilayah dengan suara terbanyak
        for (int i = 0; i < namaCalon.length; i++) {
            int terbanyak = 0;
            int idxTrbnyk = 0;
            for (int j = 0; j < wilayah.length; j++) {
                if (suara[j][i] > terbanyak) {
                    terbanyak = suara[j][i];
                    idxTrbnyk = j;
                }
            }
            System.out.println(namaCalon[i] + " memiliki suara terbanyak di: " + wilayah[idxTrbnyk]);
        }

        System.out.println("---------------------");

        //pemenang setiap wilayah
        System.out.println("Pemenang Setiap Wilayah");
        for (int i = 0; i < wilayah.length; i++) {
            int pemenang = 0;
            int idxPemenenang = 0;
            for (int j = 0; j < namaCalon.length; j++) {
                if (suara[i][j] > pemenang) {
                    pemenang = suara[i][j];
                    idxPemenenang = j;
                }
            }
            System.out.println(wilayah[i] + ": " + namaCalon[idxPemenenang]);
        }

    }

}
