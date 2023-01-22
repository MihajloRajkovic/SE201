/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exception.CenaException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mihajlo
 */
public class RezervacijaTest {

    public RezervacijaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testIzmeniCenu1() throws CenaException {
        System.out.println("izmeniCenu");
        double cena = 500.0;
        Rezervacija instance = new Rezervacija();
        instance.setUkupnaCena(cena);
        double expResult = 600.0;
        double result = instance.izmeniCenu(100);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testIzmeniCenu2() throws CenaException {
        System.out.println("izmeniCenu");
        double cena = 200.0;
        Rezervacija instance = new Rezervacija();
        instance.setUkupnaCena(cena);
        double expResult = 500.0;
        double result = instance.izmeniCenu(50);
        assertNotEquals(expResult, result, 0.0);
    }

    @Test(expected = CenaException.class)
    public void testIzmeniCenu3() throws Exception {
        System.out.println("izmeniCenu");
        double cena = 200.0;
        Rezervacija instance = new Rezervacija();
        instance.setUkupnaCena(cena);
        instance.izmeniCenu(0);
    }

}
