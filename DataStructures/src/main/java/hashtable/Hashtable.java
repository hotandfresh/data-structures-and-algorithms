package hashtable;

public class Hashtable<T> {

    public Node[] HashArray;

    public Hashtable(){
        //set the size of the new hashtable to an arbitrary size
        HashArray = new Node[2048];
    }

    //determine where to put the word in the hashtable
    public int hash(String word){
        double total = 0;

        for(int i = 0; i < word.length(); i++){
            total += word.charAt(i);
        }
        //this math keeps the value of the hash in range from 0 - 2048
        return (int)Math.floor((total * 1024)/2048);
    }

    //add a string to the hashtable
    public void add(String word, T value){
        Node node = new Node(word, value);
        int index = hash(word);
        //chain the nodes if there's a collision
        if(HashArray[index] != null){
            node.next = HashArray[index];
        }

        HashArray[index] = node;
    }

    //find the value stored for a key
    public T get(String word){
        int index = hash(word);
        Node current = HashArray[index];
        //if there are multiple nodes, keep searching till the key is found
        while(current != null){
            if(current.key == word){
                return (T)current.value;
            }
            current = current.next;
        }

        return (T)current.value;
    }

    //determines if a key is in a hashtable
    public boolean contains(String word){
        int index = hash(word);
        Node current = HashArray[index];
        //go to that index.  if it's empty, then the key is not there
        if(current == null){
            return false;
        }

        //if there's something at that index, look until the key is found
        while(current != null){
            if(current.key.equals(word)){
                return true;
            }
            current = current.next;
        }

        return false;
    }
}
