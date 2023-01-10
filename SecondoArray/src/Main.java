import java.util.Scanner;


public class Main {
    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);


        System.out.println("Inserire 10 numeri per iniziare");

        int[] newArray = new int[10];

        for (int i = 0; i < 10; i++) {
            newArray[i] = scan.nextInt();
        }

        System.out.println("Gli elementi dell'Array al contrario sono: ");
        for (int k = 9 ; k > 0; k--) {
            System.out.println(newArray[k]);
        }


    }
}