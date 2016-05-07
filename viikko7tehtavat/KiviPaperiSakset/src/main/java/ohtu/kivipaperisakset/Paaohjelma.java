package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final IO io = new IO();
    private static final KomentoTehdas komentotehdas = new KomentoTehdas(io);

    public static void main(String[] args) {

        while (true) {
            io.printRules();

            Komento komento = komentotehdas.get(io.nextLine());
            if (komento == null) {
                break;
            }
            io.gameEndsRule();
            komento.pelaa();
        }

    }
}
