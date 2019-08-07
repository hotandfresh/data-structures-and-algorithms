# Reverse an Array

## Challenge

Given an array, reverse its contents. Do not use any built in reverse methods.

## Approach & Efficiency

This solution implements a 2 pointer strategy.  One starts at the beginning of the array, and the other starts at the end of the array.  As long as the start pointer is not greater than the end pointer, swap the elements.

The time efficiency for this solution is O(n log n) because half of the array is iterated at a time.

The space efficiency for this solution is O(1) because the array is modified in place.

## Solution

![reverse array picture](/assets/reverseAnArray.png)
