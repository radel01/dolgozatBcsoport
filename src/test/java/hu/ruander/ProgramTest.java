package hu.ruander;

import hu.ruander.alakzatok.FemAlakzat;
import hu.ruander.alakzatok.Gomb;
import hu.ruander.alakzatok.Hasab;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProgramTest {
    static FemAlakzatokProgram program;
    @BeforeAll
    static void programIni(){
        Class<?> clazz = FemAlakzatokProgram.class;
        String pkg = clazz.getPackageName();
        assertEquals("hu.ruander", pkg, "a csomag 'hu.ruander' legyen.");

        program = new FemAlakzatokProgram();
        program.ujAlakzat(new Gomb(1));
        program.ujAlakzat(new Hasab(1,1,1));
    }

    @Test
    void testLista(){
        ArrayList<FemAlakzat> lista = program.getLista();
        Assertions.assertEquals(2, lista.size());

        lista.add(new Gomb(1));
        Assertions.assertEquals(2, program.getLista().size());
    }

    @Test
    void testSzamolasok(){
        Assertions.assertEquals(5.96, program.osszSuly(), 0.01);
        Assertions.assertEquals(4.81, program.gombokOsszSuly(), 0.01);

        Hasab hasab = new Hasab(1.0, 1.0, 1.0);
        Assertions.assertEquals(hasab.terfogat(), program.minV().terfogat());
        Gomb gomb = new Gomb(1.0);
        Assertions.assertEquals(gomb.terfogat(), program.maxV().terfogat());
    }
}