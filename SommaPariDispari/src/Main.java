public class Main {
    public static void main(String[] args) {

        int[] serie = {7,12,18,6,8,4,5,1,2,17};
        int pari = 0;
        int dispari = 0;

        for (int i = 0; i < serie.length; i++){
            if (i % 2 == 0)
                pari = pari + serie[i];
            if (i % 2 == 1)
               dispari = dispari + serie[i];

        }
            if (pari == dispari)
        System.out.println("Pari e dispari uguali! :D");
            else
                System.out.println("Pari e dispari sono diversi! :C");
        }
}