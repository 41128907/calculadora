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
public class CalculadoraTeste {
    
    @Test
    public void testarSoma(){
        Calculadora calc = new Calculadora();
        assertEquals(calc.somar(1,2),3);
    }   
}
