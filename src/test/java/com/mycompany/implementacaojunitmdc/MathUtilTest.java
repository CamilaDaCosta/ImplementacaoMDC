package com.mycompany.implementacaojunitmdc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author camila
 */
public class MathUtilTest {

    @Test
    public void testMdcAParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    } 
    @Test
    public void testMdcAImparP1() {
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    public void testMdcBParP1() {
        final int a = 8;
        final int b = 2;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    public void testMdcBImparP1() {
        final int a = 8;
        final int b = 1;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    //IMPLEMENTAÇÃO 2
    @Test
    public void testMdcParP2(){
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int obtido = MathUtil.mdc(a,b);
        assertTrue(obtido % divisor == 0);
    }
    @Test
    public void testMdcImparP2(){
        final int a = 15;
        final int b = 9;
        final int divisor = 1;
        final int obtido = MathUtil.mdc(a, b);
        assertTrue(obtido % divisor == 0);
    }
    
    @Test
    public void testeMdcAPositivoP3(){
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado,obtido);
    }
    @Test
    public void testeMdcANegativoP3() {
        final int a = -19;
        final int b = 0;
        final int esperado = 19;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testeMdcMParP4() {
        final int a = 9;
        final int b = 3;
        final int m = 2;
        final int esperado = 6;
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testeMdcP5() {
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = MathUtil.mdc(a * b, c);
        final int obtido = MathUtil.mdc(b, c);
        assertEquals(esperado, obtido);
    }
    @Test
    public void testeMdcP5Resultado1() {
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = 1;
        final int obtido = MathUtil.mdc(b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testeMdcP6Positivo() {
        final int a = 8;
        final int b = 2;
        final int esperado = MathUtil.mdc(a, b);
        final int obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
    }
    @Test
    public void testeMdcP6Negativo() {
        final int a = -8;
        final int b = -2;
        final int esperado = MathUtil.mdc(a, b);
        final int obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testeMdcP7TudoNegativo() {
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    public void testeMdcP7TudoPositivo() {
        final int a = 12;
        final int b = 6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    public void testeMdcP7ANegativo() {
        final int a = -12;
        final int b = 6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    @Test
    public void testeMdcP7BNegativo() {
        final int a = 12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    //IMPLEMENTAÇÃO 3 - CASO GERAL
    @Test
    void testeMdcMultiplosValores(){
        final int a = 30;
        final int b = 12;
        final int c = 4;
        final int esperado = 2;
        final int obtido = MathUtil.mdc(a,b,c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testeMdcNenhumParametro() {
        assertThrows(IllegalArgumentException.class, () -> MathUtil.mdc());
    }
    
    @Test
    void testeMdcNulo(){
        assertThrows(NullPointerException.class, () -> MathUtil.mdc(null));
    }
}
