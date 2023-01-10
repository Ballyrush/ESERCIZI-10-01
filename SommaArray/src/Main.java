import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int totale = 0 ;
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire il numero di elementi che si vuole memorizzare");
        n = scan.nextInt();

        int[] newArray = new int[n + 1];

        System.out.println("Inserire gli elementi");

        for(int i = 0 ; i < n ; i++) {
            newArray[i] = scan.nextInt();
        }

        for (int i = 0 ; i < n ; i++) {
            totale = newArray[i] + totale;
        }

        int media = totale / n;


        System.out.println("Il totale della somma è: " + totale);
        System.out.println("La media dei fattori è: " + media);
    }
}