# LinkedList

## Challenge

Implement a linked list data structure.  The linked list implemented here consists of Nodes.  Nodes hold a value of integers and has a pointer to the next node.

[See the Code](src/main/java/linkedList/LinkedList.java)

[See the Tests](src/test/java/linkedList/LinkedListTest.java)

---

## API

The methods created include:
### insert
### includes
### toString

---

## Approach & Efficiency

### insert - 

This method takes in a value and inserts that value at the beginning of the linked list.  

Therefore, its time complexity is O(1).  Space is consistent at O(1) as well.

### includes - 

This method takes in a value and checks if that value exists in the linked list.  Since indexing is not a feature of linked lists, every node must be visited to see if it holds the value being searched.  If the value is found, a true is returned.  Otherwise, a false is returned at the very end if the value is not found.

The time complexity is O(N) because the last Node might be the one with the value being searched.  Space complexity is O(1) since no space is needed.


### toString

This method prints all the values in the linked list.  It takes in no arguments.

Since all Nodes must be traversed, the time complexity is O(N).  No space is used for this method, so space complexity is O(1).
