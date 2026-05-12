import java.util.Scanner;
//Napišite program koji učitava broj koji predstavlja iznos u
// eurima koji prodavačica treba uzvratiti klijentu.
// (Demo klase Scanner) Prodavačica uvijek uzvraća u najvećim novčanicama (kovanicama).
// Program treba ispisati u koliko kojih novčanica (kovanica) treba uzvratiti.
// Novčanice eura imaju vrijednost 500, 200, 100, 50, 20, 10 i 5 eura,
// a kovanice su od 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02 i 0.01 eura.
public class Novci {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        double[] novcanice_kovanice = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        System.out.println("Unesite iznos u eurime: ");
        double iznos = a.nextDouble();
        // pretvoriti cijeli iznos u cente
        int centi = (int) (iznos*100);


        for (double i : novcanice_kovanice) {
            // pretvoriti svaki iznos iz liste takoder u cente
            int novcanice_kovanice_centi = (int) (i * 100);

            int broj = centi / novcanice_kovanice_centi;

            if (broj > 0) {
                //if(i >2){
                //    System.out.println("Novčanica od " +i+ "€ vratit ćemo " + broj);
                //}else {
                //    System.out.println("Kovanica od " +i+ "€ vratit ćemo " + broj);
                //}

                if (i>=1) {
                    System.out.println(broj + "*" + (int)i);
                }else {
                    System.out.println(broj + "*" + i);
                }
            }

            centi = centi % novcanice_kovanice_centi;
        }


    }

}

