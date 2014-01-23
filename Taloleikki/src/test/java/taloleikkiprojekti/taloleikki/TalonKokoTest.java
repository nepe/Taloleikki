/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package taloleikkiprojekti.taloleikki;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nepe@cs
 */
public class TalonKokoTest {
    private TalonKoko talonKoko;
    
    public TalonKokoTest() {
    }
    
    @Before
    public void setUp() {
        talonKoko = new TalonKoko(2, 4);
        
    }
    @Test
    public void testataanPituutta() {
        assertEquals(2, talonKoko.getPohjanPituus());
    }
    
    @Test
    public void testataanLeveytta() {
        assertEquals(4, talonKoko.getPohjanLeveys());
    }
    
    @Test
    public void testataanTalonKokoa() {
        assertEquals("Pohjan pituus on 2 ja pohjan leveys on 4", talonKoko.toString());
    }
    
}
