# Binary Search of a 1D Array

## Challenge Description

Given a sorted array and a key, return its index.  If the key is not in the array, return -1.

## Approach & Efficiency

This solution sets the start value to 0 and the end value to the length of the array minus 1.  While the start value is less than the end value, search for the key.  If the value of middle index of the array is the key, end the search.  Otherwise, if the key is larger than the middle value, search on the right.  If the key is smaller than the middle value, search on the left.

The time efficiency for this solution is O(log N) because half of the array is searched at a time.

The space efficiency for this solution is O(1) because no extra space is needed.

## Solution

[See the code](/Challenges/src/main/java/Challenges/BinarySearch.java)

![Binary Search Of An Array picture](/assets/binarySearchOfArray.png)

## Resources
[Wiki](https://en.wikipedia.org/wiki/Binary_search_algorithm)