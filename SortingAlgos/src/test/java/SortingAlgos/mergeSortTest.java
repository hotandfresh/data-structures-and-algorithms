package SortingAlgos;

import org.junit.Test;

import static org.junit.Assert.*;

public class mergeSortTest {
    @Test
    public void canMergeSort(){
        int[] arr = {4, 9, 1, 5, 3, 8, 2, 6, 7, 10};
        mergeSort ms = new mergeSort();

        ms.mergeSort(arr);

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertArrayEquals(expected, arr);
    }

}