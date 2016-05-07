package ohtu.kivipaperisakset;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends TekoalyPeli {

    public KPSParempiTekoaly(IO io) {
        super(io);
    }

    @Override
    public AI setTekoaly() {
        return new TekoalyParannettu(20);
    }
}
