
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inserire parole andando a capo ad ognuna di esse: ");
        System.out.println("Quando si ha finito andare a capo a vuoto.");
        Scanner scan = new Scanner(System.in);

        int lunghezza = 0;

        while (true) {
            String testo = scan.nextLine();
            if (testo.equals(""))
                break;
            if (Character.isUpperCase(testo.charAt(0))) {
                lunghezza = lunghezza + testo.length();
            }

        }

        System.out.println(lunghezza);
    }
}