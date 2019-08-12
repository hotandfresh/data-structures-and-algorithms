package linkedList;

public class LinkedList {
    public Node head;
    public Node current;

    //insert - takes in any value as an argument and adds a new node with that value to the head of the list in O(1) time
    public void insert(int data){
        //instantiate a new head with the data given
        Node newHead = new Node(data);

        //set the next pointer of newHead to point to the original head
        //this is done first as to not lose the connection to the rest of list
        newHead.next = head;

        //re-assign head to newHead
        head = newHead;
    }

    //includes - returns boolean depending on whether that value exists or not
    public boolean includes(int val){
        //set a pointer to start at head
        current = head;
        //keep traversing if where we are is not null
        while(current != null){
            //if the value is found, stop traversing and return true
            if(current.data == val) return true;
            //otherwise, move the current pointer to the next node
            current = current.next;
        }

        //if the value is not found, return false
        return false;
    }

    //toString - returns string representing all values in the LL
    public String toString(){
        StringBuilder sb = new StringBuilder();

        //set a pointer to start at head
        current = head;

        //keep traversing if where we are is not null
        while(current != null){
            //keep appending the values
            sb.append(current.data + " ");
            //move the current pointer to the next node
            current = current.next;
        }

        return sb.toString();
    }
}
