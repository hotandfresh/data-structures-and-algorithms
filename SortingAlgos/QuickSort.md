# Quicksort

## Summary
This sorting algorithm starts utilizes a pivot point.  Numbers less than the pivot are moved to the left and numbers greater than the pivot are moved to the right. This process is applied to the left and to the right portion of the array.

[See the Code](src/main/java/SortingAlgos/QuickSort.java)


[See the Test](src/test/java/SortingAlgos/QuickSortTest.java)


## Description
Pick a pivot. The solution picks a pivot that's the middle index. Walk through the array from the left and from the right.  During this walk, swap the elements if the element on the left is greater and if the element on the right is smaller.

Repeat this process on the two halves of the array, and then on the halves of those halves.

## Approach & Efficiency
Space Complexity 

Time Complexity is 

## Resources
Many thanks to the [Quick Sort Hacker Rank tutorial](https://www.youtube.com/watch?v=SLauY6PpjW4&t=318s)