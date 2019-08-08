package Challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void canSearchForKeyThatExists(){
        int[] arr = {4,8,15,16,23,42};
        int key = 15;

        BinarySearch binarySearchOfArray = new BinarySearch();
        int result = binarySearchOfArray.binarySearchArray(arr, key);
        int expected = 2;

        assertEquals(result, expected);
    }

    @Test
    public void canDetectIfKeyDoesNotExist(){
        int[] arr = {4,8,15,16,23,42};
        int key = 100;

        BinarySearch binarySearchOfArray = new BinarySearch();
        int result = binarySearchOfArray.binarySearchArray(arr, key);
        int expected = -1;

        assertEquals(result, expected);
    }
}