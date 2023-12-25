package com.exemple;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




public class SimpleCalculatorTest {
    

    @Test 
    void twoPlusTwoShouldFour()
    {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4 , calculator.add(2, 2));
        
    
    }

    @Test 
    void twoPlusFourShouldSix()
    {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(6 , calculator.add(2, 4));
        
    
    }

    @Test 
    void twoPlusOneShouldThree()
    {
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(3 == calculator.add(2, 1));
        
    
    }


    @Test 
    void MinsuOnePlusFourShouldThree()
    {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(3 , calculator.add(-1, 4));
        
    
    }


    @Test 
    void OnePlusFourShouldFive()
    {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5 , calculator.add(1, 4));
        
    
    }

    @Test
    void onePlusOneShouldEqualsTwo()
    {
        var calculator = new SimpleCalculator();
        assertTrue(2 == calculator.add(1, 1));
    }

    


}
