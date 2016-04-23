
package ohtu.intjoukkosovellus;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntJoukkoKaksiparametrisellaKonstruktorillaTest extends IntJoukkoTest {
    
    @Before
    public void setUp() {
        joukko = new IntJoukko(4, 2);
        joukko.lisaa(10);
        joukko.lisaa(3);
    }

    @Override
    @Test
    public void tilaKasvaa() {
        joukko.lisaa(1);
        assertTrue(joukko.size()==4);
        joukko.lisaa(8);
        assertTrue(joukko.size()==6);
    }
}
