# Left Join

## Challenge
- Write a function that LEFT JOINs two hashmaps into a single data structure.
- The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
- The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
- Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
- LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.
- The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic.
- Avoid utilizing any of the library methods available to your language.

[See the Code](src/main/java/hashtable/LeftJoin.java)

[See the Tests](src/test/java/hashtable/LeftJoinTest.java)

## Approach & Efficiency
Time Complexity is O(n) because every index of the left hashmap is checked against the right hashmap

Space Complexity is O(n) because a new structure is used to store everything from the left table.

## Solution
![left join picture](/assets/leftJoin.png)

## Methods
```leftJoin```: takes in two hashtables and returns a list of lists of all values found in the left table along with the value of the right hashtable if the key is the same.

## Acknowledgements
Regex was taken from [here](https://stackoverflow.com/questions/7384791/splitting-strings-through-regular-expressions-by-punctuation-and-whitespace-etc)
