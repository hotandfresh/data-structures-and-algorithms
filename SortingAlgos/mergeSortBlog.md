# Presenting the Insertion Sort Algo in a Novel Way

## Learning Objectives
- understand insertion sort
    - insert in ascending order

## Information Flow
- Repeatedly compare numbers to the one on its left.
    - if it's greater, swap it
    - continue swapping until the number to its left is smaller
   
## Pseudo Code
for i <- length of arr
    j <- i - 1
    int temp <- arr`[i]`
    
    while j >= 0 and temp < arr`[j]`
        arr`[j + 1]` <- arr`[j]`
        j <- j - 1
    
    arr`[j + 1]` <- temp

## The Pseudo Code in More Words
- loop through the entire array

    - set j to be i - 1
    - set temp to be the value of arr at i
    
    while j is greater than 0 and the value of where we're at is greater than the value to our left, commence swapping:
    
        - set the value of arr at j + 1 to be that value that was at our left
        - decrement j
        
    - set the value of array at j + 1 to be temp
  
## Diagram
![Insertion Sort](/assets/insertionSort.png)
    
## Algorithm
At each number, this algo checks if the current number is greater than the one to the left.  If it is, swap it.  Is that number, that was just swapped, less than the one to its left?  If yes, swap. Continue doing so until the number that was swapped is greater than the one to its left.

## Images

## Video Reference
[Insertion Sort Represented as a Romanian Folk Dance](https://www.youtube.com/watch?v=ROalU379l3U)

## Reading References
[Khan Academy Insertion Sort](https://www.khanacademy.org/computing/computer-science/algorithms/insertion-sort/a/insertion-sort)

[Kent University Insertion Sort](http://personal.kent.edu/~rmuhamma/Algorithms/MyAlgorithms/Sorting/insertionSort.htm)
