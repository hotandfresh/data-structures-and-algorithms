package SortingAlgos;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void canSort(){
        int[] arr = {3, 1, 9, 0};

        InsertionSort is = new InsertionSort();
        is.InsertionSort(arr);
        int[] expected = {0, 1, 3, 9};
        assertArrayEquals(arr, expected);
    }
}