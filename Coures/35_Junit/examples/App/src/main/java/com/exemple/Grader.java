package com.exemple;

public class Grader {
    
    public char determineLettreGrader(int numberGrader)
    {
        if(numberGrader < 0 )
        {
            throw new IllegalArgumentException("Number grader can not be negative ");

        }
        else if(numberGrader < 60)
        {
            return 'F';
        }
        else if(numberGrader < 70)
        {
            return 'D';
        }
        else if(numberGrader < 80)
        {
            return 'C';
        }
        else if(numberGrader < 90)
        {
            return 'B';
        }
        else 
        {
            return 'A';
        }


    }
}
