package ohtu.kivipaperisakset;

/**
 * Created by iilumme.
 */
public abstract class TekoalyPeli extends Peli {

    protected AI tekoaly;

    public TekoalyPeli(IO io) {
        super(io);
    }

    protected abstract AI setTekoaly();

    @Override
    public void pelaa() {

        this.tekoaly = setTekoaly();

        io.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = io.nextLine();
        String tokanSiirto = tekoaly.annaSiirto();

        io.print("Tietokone valitsi: " + tokanSiirto);

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            io.print(tuomari + "\nEnsimmäisen pelaajan siirto: ");

            ekanSiirto = io.nextLine();

            tokanSiirto = tekoaly.annaSiirto();
            io.print("Tietokone valitsi: " + tokanSiirto);
            tekoaly.asetaSiirto(ekanSiirto);
        }

    }
}
