import java.util.Scanner;

public class ProvjeraOIB {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Unesite OIB: ");
        String oib = a.nextLine();

        if (oib.length() != 11){
            System.out.println("nije unešen oib!");
        }else {
            int[] prvih10 = new int[10];

            for (int i = 0; i < 10; i++) {
                prvih10[i] = Character.getNumericValue(oib.charAt(i));
            }
            int kontrolna_znamenka = Character.getNumericValue(oib.charAt(10));

            int ostatak = 10;

            //za svih 10 znamenki
            for (int i = 0; i < 10; i++) {

                ostatak = ostatak + prvih10[i];

                ostatak = ostatak % 10;

                if (ostatak == 0) {
                    ostatak = 10;
                }

                ostatak = ostatak * 2;

                ostatak = ostatak % 11;
            }

            int kontrolna;

            if (ostatak == 1) {
                kontrolna = 0;
            } else {
                kontrolna = 11 - ostatak;
            }

            if (kontrolna == kontrolna_znamenka) {
                System.out.println("OIB je ispravan.");
            } else {
                System.out.println("OIB nije ispravan.");
            }
        }
    }
}
