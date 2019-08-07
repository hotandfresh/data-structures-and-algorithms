# Reverse an Array

## Challenge Description

Given an array and a value, insert the value at the middle index of the array.

## Approach & Efficiency

This solution first determines the middle index of the original array.  It then iterates through the new array and inserts values from the original array.  If it passes the middle index, an offset of 1 is needed because the original array is 1 index shorter than the new array.

The time efficiency for this solution is O(N) because the entire original array needs to be copied.

The space efficiency for this solution is O(N) because the entire array needs to be copied.

## Solution

[See the code](/Challenges/src/main/java/Challenges/ArrayShift.java)

![shift array picture](/assets/shiftArray.png)
