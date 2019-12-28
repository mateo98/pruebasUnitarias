package io.grisales.mateo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CadenaTest {
    private Cadena cd;
    @Before
    public void setUp() throws Exception {
        cd = new Cadena();
    }

    @Test
    public void concatenar() {
        String esperado = "pedro perez";
        Assert.assertEquals("No es lo esperado", esperado, cd.concatenar("pedro ", "perez"));
    }
}