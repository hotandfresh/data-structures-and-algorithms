# Merge Sort

## Summary
The merge sort implemented here is a recursive solution. This strategy sorts the left half and then sorts the right half.  Both halves are then merged in sorted order.

[See the Code](src/main/java/SortingAlgos/mergeSort.java)


[See the Test](src/test/java/SortingAlgos/mergeSortTest.java)


## Description
This divide and conquer strategy requires splitting the array in half with a left pointer that starts at the beginning and a right pointer that starts at the end.  If at any point the left is greater than the right, we are done.

During this process, a recursive method is called that will sort those halves.  This method takes in the array, the left starting positing and the right ending position.  It's difficult to merge in place, so a temp array is used. Within this method is a while loop that will swap the elements from the left and ride side if they are not in the correct order. The arraycopy method copies the remaining elements from one array into the other.  These remaining numbers are ones in the correct order and no swapping is needed for them.

## Approach & Efficiency
Space Complexity is O(n) because the recursive stack is used.

Time Complexity is O(n^2) while average case is O(n log n). The worst case is O(n^2) because the pivot could be at either extreme, the first index or the last index and there would be n calls to the rest of the array.

## Resources
Many thanks to the [HackerRank Merge Sort](https://www.youtube.com/watch?v=KF2j-9iSf4Q&t=229s)
