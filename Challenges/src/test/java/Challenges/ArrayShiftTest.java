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
    public void emptyArray(){
        int[] arr = {};
        int val = 5;

        int[] expected = {5};

        ArrayShift classUnderTest = new ArrayShift();
        assertArrayEquals("5 should be the only number", classUnderTest.ShiftArray(arr, val), expected);

    }

    @Test
    public void arrayOneNumber(){
        int[] arr = {6};
        int val = 5;

        int[] expected = {6,5};

        ArrayShift classUnderTest = new ArrayShift();
        assertArrayEquals("5 should be after 6", classUnderTest.ShiftArray(arr, val), expected);

    }

    @Test
    public void oddArray(){
        int[] arr = {4, 8, 15, 23, 42};
        int val = 16;

        int[] expected = {4, 8, 15, 16, 23, 42};

        ArrayShift classUnderTest = new ArrayShift();
        assertArrayEquals("16 should be inserted in the middle", classUnderTest.ShiftArray(arr, val), expected);
    }
}