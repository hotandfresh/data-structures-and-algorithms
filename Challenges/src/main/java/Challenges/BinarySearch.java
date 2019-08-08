package Challenges;

public class BinarySearch {
    public int binarySearchArray(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (end + start)/2;
            if(key > arr[mid]) start = mid + 1;
            else if(key < arr[mid]) end = mid - 1;
            else return mid;
        }

        return -1;
    }
}
