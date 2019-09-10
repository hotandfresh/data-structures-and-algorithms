# Merge Sort

## Summary
The merge sort implemented here is a 

[See the Code](src/main/java/SortingAlgos/mergeSort.java)


[See the Test](src/test/java/SortingAlgos/mergeSortTest.java)


## Description
There are 2 pointers, i and j.  While i is less than the length of the array, do the following logic:

- set j to be one less than i
- set a variable temp to be equal to the number at array index i
- while j is greater than 0 and the value of temp is less than the value to its left, commence swapping:
    - move the value that was on the left to where we currently are in the array
    - decrement j
    - the logic in the while loop is the one that keeps comparing the number to the one to its left
- insert back the temp number

## Approach & Efficiency
Space Complexity is O(1) because the array is manipulated and no extra space is created.

Time Complexity is O(N) because the last number in the array could be the smallest and it would be compared with every number to its left.

## Resources
[Insertion Sort in 2 Mins](https://www.youtube.com/watch?v=JU767SDMDvA)
