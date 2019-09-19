# Repeated Words

## Challenge
Return the first word that is repeated in a lengthy string.

[See the Code](src/main/java/hashtable/RepeatedWord.java)

[See the Tests](src/test/java/hashtable/RepeatedWordTest.java)

## Approach & Efficiency
Space complexity is O(n) because all the words will be stored if they were all unique.

Time complexity is O(1) because the value can be quickly found based on the hash of the key.

## Solution
![repeated word solution](/assets/repeatedWord.png)

## Methods
```repeatedWords```: takes in a lengthy string, strips it of all the spaces and punctuations, and places each word into a string array.  It then iterates over each word.  If the word is in the hashtable, return it because it's the first repeated word.  If it's not in the hashtable, add it.

## Acknowledgements
Regex was taken from [here](https://stackoverflow.com/questions/7384791/splitting-strings-through-regular-expressions-by-punctuation-and-whitespace-etc)
