package SortingAlgos;

public class mergeSort {

    public void mergeSort(int[] arr){
        mergeSort(arr, new int[arr.length], 0, arr.length - 1);
    }
    //recursive method
    public void mergeSort(int[] arr, int[] temp, int left, int right){
        if(left >= right){
            return;
        }

        int middle = (left + right)/2;
        mergeSort(arr, temp, left, middle);
        mergeSort(arr, temp, middle + 1, right);
        mergeHalves(arr, temp, left, right);
    }

    public void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd){
        int leftEnd = (rightEnd + leftStart)/2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while(left <= leftEnd && right <= rightEnd){
            if(arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        System.arraycopy(arr, left, temp, index, leftEnd - left + 1);
        System.arraycopy(arr, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, arr, leftStart, size);
    }
}
