package ohtu.kivipaperisakset;

/**
 * Created by iilumme.
 */
public abstract class Peli implements Komento{

    protected Tuomari tuomari;
    protected IO io;

    public Peli(IO io) {
        this.tuomari = new Tuomari();
        this.io = io;
    }

    @Override
    public abstract void pelaa();

    protected static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
