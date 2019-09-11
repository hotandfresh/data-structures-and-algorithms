package SortingAlgos;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void canQuickSort(){
        int[] arr = {4, 9, 1, 5, 3, 8, 2, 6, 7, 10};

        QuickSort qs = new QuickSort();
        qs.quicksort(arr);

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertArrayEquals(expected, arr);

    }

}