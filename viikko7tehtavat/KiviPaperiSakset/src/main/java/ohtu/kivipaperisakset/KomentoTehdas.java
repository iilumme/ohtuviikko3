package ohtu.kivipaperisakset;

import java.util.HashMap;

/**
 * Created by iilumme.
 */
public class KomentoTehdas {

    private HashMap<String, Komento> komennot;

    public KomentoTehdas(IO io) {
        komennot = new HashMap<String, Komento>();
        komennot.put("a", new KPSPelaajaVsPelaaja(io));
        komennot.put("b", new KPSTekoaly(io));
        komennot.put("c", new KPSParempiTekoaly(io));
    }

    public Komento get(String game) {
        Komento komento = komennot.get(game);
        if (komento == null) {
            return null;
        }
        return komento;
    }
}