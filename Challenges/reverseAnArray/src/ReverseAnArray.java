import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] toBeReversed = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(reverseArray(toBeReversed)));
    }

    //Takes in an array and returns an array
    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        //as long as the start pointer is not greater than the end pointer,
        //swap the elements:
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
