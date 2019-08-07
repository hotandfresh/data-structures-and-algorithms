package Challenges;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest{
    @Test
    public void evenArray(){
        int[] arr = {2, 4, 6, 8};
        int val = 5;

        int[] expected = {2, 4, 5, 6, 8};

        ArrayShift classUnderTest = new ArrayShift();
        assertArrayEquals("5 should be inserted in the middle", classUnderTest.ShiftArray(arr, val), expected);

    }

    @Test
    public void oddArray(){
        int[] arr = {4, 8, 15, 23, 42};
        int val = 16;

        int[] result = ArrayShift.ShiftArray(arr, val);
        int[] expected = {4, 8, 15, 16, 23, 42};

        assertEquals(expected, result);
    }
}