import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci la parola da filtrare:");
        String s = input.nextLine();
        String s1 = "";
        s1 = s.replaceAll("[bcdfghjklmnpqrstvz]", "");
        System.out.println("Parola senza consonanti: " + s1);
    }
}