package ohtu;

import javax.swing.*;

/**
 * Created by iilumme.
 */
public class Summa implements Komento {

    private Sovelluslogiikka sovelluslogiikka;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private int edellinen;

    public Summa(Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta) {
        this.sovelluslogiikka = sovelluslogiikka;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.edellinen = 0;
    }

    @Override
    public void suorita() {
        edellinen = Integer.parseInt(tuloskentta.getText());
        sovelluslogiikka.plus(Integer.parseInt(syotekentta.getText()));
        tuloskentta.setText("" + sovelluslogiikka.tulos());
    }

    @Override
    public void peru() {
        tuloskentta.setText("" + edellinen);
    }
}
