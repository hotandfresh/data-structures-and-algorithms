package Challenges;

import java.util.Arrays;

public class ArrayShift {

    public int[] ShiftArray(int[] arr, int val){
        //declare new array
        int[] newArr = new int[arr.length + 1];

        //find middle index
        double mid = Math.floor(arr.length/2);

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
