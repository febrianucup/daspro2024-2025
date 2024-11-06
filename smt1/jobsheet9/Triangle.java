package jobsheet9;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Input N: ");
        int n=input.nextInt();

        int i=1;

        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
