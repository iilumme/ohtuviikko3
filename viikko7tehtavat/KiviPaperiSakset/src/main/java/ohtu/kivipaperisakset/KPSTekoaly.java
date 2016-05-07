package ohtu.kivipaperisakset;

public class KPSTekoaly extends TekoalyPeli {

    public KPSTekoaly(IO io) {
        super(io);
    }

    @Override
    protected AI setTekoaly() {
        return new Tekoaly();
    }
}