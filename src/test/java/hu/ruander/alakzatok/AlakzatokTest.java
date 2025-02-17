package hu.ruander.alakzatok;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlakzatokTest {
    FemAlakzat alakzat;

    @Test
    void testAbstract() throws NoSuchMethodException {
        Class<?> clazz = FemAlakzat.class;
        assertTrue(Modifier.isAbstract(clazz.getModifiers()), "A 'FemAlakzat' osztály legyen abstract.");

        String pkg = clazz.getPackageName();
        assertEquals("hu.ruander.alakzatok", pkg, "a csomag 'hu.ruander.alakzatok' legyen.");

        Method method = clazz.getDeclaredMethod("terfogat");
        boolean abs = Modifier.isAbstract(method.getModifiers());
        assertTrue(abs, "a 'terfogat' metódus legyen abstract.");
    }

    @Test
    void testFajsuly(){
        assertEquals(1.15, FemAlakzat.getFajsuly());
    }

    @Test
    void testGombTerfogat(){
        alakzat = new Gomb(1.0);
        assertEquals(4.188, alakzat.terfogat(), 0.001);
    }

    @Test
    void testGombSuly(){
        alakzat = new Gomb(1.0);
        double d = alakzat.suly();
        assertEquals(4.817, alakzat.suly(), 0.001);
    }

    @Test
    void testHasabTerfogat(){
        alakzat = new Hasab(1.0, 1.0, 1.0);
        assertEquals(1, alakzat.terfogat(), 0.001);
    }

    @Test
    void testHasabSuly(){
        alakzat = new Hasab(1.0, 1.0, 1.0);
        assertEquals(1.15, alakzat.suly(), 0.001);
    }

    @Test
    void testHasabParamSorrend(){
        Hasab hasab = new Hasab(1,2,3);
        assertEquals(1, hasab.getA());
        assertEquals(2, hasab.getB());
        assertEquals(3, hasab.getM());
    }
}
