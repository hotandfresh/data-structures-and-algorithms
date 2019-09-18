package SortingAlgos;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void canQuickSort(){
//        int[] arr = {10, 2, 9, 1, 3, 8, 6, 7};
        int[] arr = {10, 5, 2, 6 ,1};

        QuickSort qs = new QuickSort();
        qs.quicksort(arr);

        int[] expected = {1, 2, 5, 6, 10};

        assertArrayEquals(expected, arr);

    }

}