package io.grisales.mateo.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {
  private Operaciones op;

   @Before
    public void setup(){
       op = new Operaciones();
   }

    @Test
    public void sumaTest(){
        Assert.assertEquals("La suma es igual", 11, op.sumar(5,6));
    }

    @Test
    public void restaTest(){
        Assert.assertEquals("La suma no es igual", 1, op.restar(6,5));
    }

    @Test
    public void multiplicaTest(){
        Assert.assertEquals("La multiplicacion no es igual", 30,op.multiplicar(5,6));
    }

    @Test
    public void dividirTest(){
        Assert.assertEquals("La division no es igual", 2,op.dividir(6,3));
    }
}
