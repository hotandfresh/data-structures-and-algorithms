# Quicksort Presentation

## Learning Objectives
- pivot
- swap

## Information Flow
- video
- code
- presentation slide
- whiteboard if needed

## Algorithm
Start by picking a pivot point.  Use the middle of the array.  Set a left pointer that starts at the 0th index and a right pointer that starts at the end of the array.
 
Increment the left and decrement the right until a number is not in the correct spot, e.g. a number on the left is greater or a number on the right is less than the pivot. If that's the case, swap the numbers.

Call quicksort on either halves and repeat the process.

## The Pseudo Code in More Words
- loop through the entire array

    - set j to be i - 1
    - set temp to be the value of arr at i
    
    while j is greater than 0 and the value of where we're at is greater than the value to our left, commence swapping:
    
        - set the value of arr at j + 1 to be that value that was at our left
        - decrement j
        
    - set the value of array at j + 1 to be temp
  
## Image
![Insertion Sort](/assets/quickSort.png)
    
## Video References
[Hackerrank Sort](https://www.youtube.com/watch?v=SLauY6PpjW4&t=318s)

