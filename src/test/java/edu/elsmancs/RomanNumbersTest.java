package edu.elsmancs;

import edu.elsmancs.RomanNumbers;
import edu.elsmancs.RomanSymbols;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class RomanNumbersTest 
{
    /**
     *  Check that the method to get the decimal value from the enum
     *  works properly.
     */
    @Test
    public void romanSymbolsTest()
    {
        RomanSymbols romanSymbols = RomanSymbols.C;
        assertEquals( 100, romanSymbols.getDecimalValue() );
    }
}
