
package ohtu.intjoukkosovellus;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class IntJoukkuYksiparametrisellaKonstruktorillaTest extends IntJoukkoTest {
    
    @Before
    @Override
    public void setUp() {
        joukko = new IntJoukko(3);
        joukko.lisaa(10);
        joukko.lisaa(3);
    }

    @Override
    @Test
    public void tilaKasvaa() {
        assertTrue(joukko.size()==3);
        joukko.lisaa(8);
        assertTrue(joukko.size()==8);
    }
}
