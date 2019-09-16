# Hashtables
A hashtable is a data structure that maps keys to values.  Keys are hash and that determines where the value will be stored in the hashtable.

## Challenge
Implement a hashtable that can hash a key, add a key value pair, find the value for a key, and determines if a key exists.

## Approach & Efficiency
Hashtables have a space efficiency of O(n) because space is used to store the key value pairs. 

Its time efficiency look up is O(1) because the hash of the key allows for an immediate lookup.  However, if there's a collision, searching a particular value will be worse than O(1); all keys at that index must be searched in order to find that value.

## Methods
```add```: takes in a key and value, hashes the key, adds the pair to the table, and handles collisions.

```get```: takes in a key and returns the value from the table.

```contains```: takes in a key and returns a boolean, which will indicate if the key is in the hashtable

```hash```: hashes the key to a value that is in range from 0 - 2048.  2048 was arbitrarily picked. 

## Acknowledgements
[HackerRank Tutorial](https://www.youtube.com/watch?v=shs0KM3wKv8)

[Derek Banas Tutorial](https://www.youtube.com/watch?v=B4vqVDeERhI)

[Wikipedia](https://en.wikipedia.org/wiki/Hash_table)