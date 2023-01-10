import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire il numero di elementi che si vuole memorizzare");
        n = scan.nextInt();

        int[] newArray = new int[n];

        System.out.println("Inserire gli elementi");

        for(int i = 0 ; i < n ; i++) {
            newArray[i] = scan.nextInt();
        }

        int sommaPari = 0;

        for(int i = 0 ; i < n ; i+=2) {
            if (i % 2 == 0) {
                sommaPari += newArray[i];
            }

        }

        System.out.println("Il totale della somma è: " + sommaPari);
    }
}