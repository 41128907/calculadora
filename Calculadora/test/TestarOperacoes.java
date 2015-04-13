/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 41128907
 */
public class TestarOperacoes {
    
    @Test
    public void testarSoma(){
        Calculadora calc = new Calculadora();
        assertTrue(calc.subtrair(1,1)== 0);
        assertTrue(calc.subtrair(-1,-2) == 1);
        assertFalse(calc.subtrair(3,3) == 3);
        assertEquals(calc.multiplicar(3,2), 6);
        assertFalse(calc.multiplicar(3,3) == 3);
        assertTrue(calc.multiplicar(3,3) == 9);
        assertEquals(calc.dividir(3,2), 1);
        assertFalse(calc.dividir(3,3) == 3);
        assertTrue(calc.dividir(3,4) == 0);

    }   
}
