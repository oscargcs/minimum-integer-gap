package org.oscar.minimum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    FindMinimumGap f=new FindMinimumGap();


    @Test
    public void arrayWithZero()
    {
        int[] array = {0, 1, 2, 10};
        assertEquals(f.returnSmallestIntegerGap(array), "3");
    }

    @Test
    public void arrayRepeatedNumbers()
    {
        int[] array = {2, 3, 3, 4, 5};
        assertEquals(f.returnSmallestIntegerGap(array), "There are no integer gaps");
    }

    @Test
    public void arrayWithoutGaps()
    {
        int[] array = {4, 2, 3};
        assertEquals(f.returnSmallestIntegerGap(array), "There are no integer gaps");
    }

    @Test
    public void arrayWithNegativeNumbers()
    {
        int[] array = {4, -2, 3};
        assertEquals(f.returnSmallestIntegerGap(array), "-1");
    }


}
