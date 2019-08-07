package Challenges;

import java.util.Arrays;

public class ArrayShift {

    public int[] ShiftArray(int[] arr, int val){
        //declare new array
        int[] newArr = new int[arr.length + 1];

        //edge case: arr length is 1
        if(arr.length == 1){
            newArr[0] = arr[0];
            newArr[1] = val;
            return newArr;
        }

        //find middle index
        int mid = (arr.length + 1)/2;

        //start iterating through newArr and add in values from arr
        for(int i = 0; i < newArr.length; i++){
            //add val to the middle index
            if(i == mid) newArr[i] = val;
            else if(i != mid && i > mid) newArr[i] = arr[i - 1];
            else newArr[i] = arr[i];
        }

        return newArr;
    }
}
