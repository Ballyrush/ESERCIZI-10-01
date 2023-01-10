import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Scrivi qualcosa daiii");

        String s = scan.nextLine();
        String s1 = "";
        s1 = s.replaceAll("[aeiouAEIOU]" , "");
        System.out.println("Ecco qui il risultato: " + s1);
    }
}