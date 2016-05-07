package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends Peli {

    public KPSPelaajaVsPelaaja(IO io) {
        super(io);
    }

    @Override
    public void pelaa() {
        io.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = io.nextLine();
        io.print("Toisen pelaajan siirto: ");
        String tokanSiirto = io.nextLine();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            io.print(tuomari + "\nEnsimmäisen pelaajan siirto: ");

            ekanSiirto = io.nextLine();
            
            io.print("Toisen pelaajan siirto: ");
            tokanSiirto = io.nextLine();
        }

        io.print("\nKiitos!\n" + tuomari);
    }
}