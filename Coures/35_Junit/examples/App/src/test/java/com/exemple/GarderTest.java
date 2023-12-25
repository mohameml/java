package com.exemple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;



public class GarderTest {


    @Test
    void fiftyNineShouldReturF()
    {
        var garder = new Grader();

        assertEquals( 'F',garder.determineLettreGrader(59));
    }

    @Test
    void sixtyNineShouldReturD()
    {
        var garder = new Grader();

        assertEquals( 'D',garder.determineLettreGrader(69));
    }

    @Test
    void sventyNineShouldReturC()
    {
        var garder = new Grader();

        assertEquals( 'C',garder.determineLettreGrader(79));
    }

    @Test
    void heightyShouldReturB()
    {
        var garder = new Grader();

        assertEquals( 'B',garder.determineLettreGrader(80));
    }

    @Test
    void ElseShouldReturB()
    {
        var garder = new Grader();

        assertEquals( 'A',garder.determineLettreGrader(99));
    }

    @Test
    void MinsuOneShouldReturnIllegalException()
    {
        var garder = new Grader();

        // assertEquals( 'A',garder.
        
        assertThrows(IllegalArgumentException.class, ( ) -> {
            garder.determineLettreGrader( -1 );

        });
    
    }

    
}
