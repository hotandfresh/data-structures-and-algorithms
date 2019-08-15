package linkedList;

public class LinkedList<T> {
    public Node <T> head;
    public Node <T> current;

    //merge 2 linked list
    public static LinkedList mergeLists(LinkedList one, LinkedList two){

        if(one.head != null && two.head == null){
            return one;
        } else if(one.head == null && two.head != null){
            return two;
        } else if(one.head == null && two.head == null){
            throw new NullPointerException();
        }

        Node currentOne = one.head;
        Node currentTwo = two.head;
        Node runner1 = currentOne.next;
        Node runner2 = currentTwo.next;

        while(runner1 != null && runner2 != null){
            currentOne.next = currentTwo;
            currentOne = currentOne.next;
            currentTwo = currentTwo.next;
            currentOne.next = runner1;
            currentOne = currentOne.next;
            runner1 = currentOne.next;
            runner2 = currentTwo.next;
        }

        if(runner1 != null && runner2 == null){
            //if LLone is longer
            currentOne.next = currentTwo;
            currentOne = currentOne.next;
            currentOne.next = runner1;

        } else {
            //happy path and if LLtwo is longer
            currentOne.next = currentTwo;
        }

        return one;
    }

    //Finds the Kth element from the end of a LL
    public T kthFromEnd(int k){
        int llLength = 0;
        current = head;

        while(current != null){
            llLength++;
            current = current.next;
        }

        if(k > llLength || k < 0){

            throw new IndexOutOfBoundsException();
        }

        current = head;

        if(k == llLength){
            return current.data;
        }

        for(int i = 0; i <= llLength - k; i++){
            current = current.next;
        }

        return current.data;
    }

    //append to the end of a list
    public void append(T data){
        if(head == null) {
            head = new Node(data);
            return;
        }
        current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    //insert - takes in any value as an argument and adds a new node with that value to the head of the list in O(1) time
    public void insert(T data){
        //instantiate a new head with the data given
        Node newHead = new Node(data);
        if(head == null) {
            head = new Node(data);
            return;
        }
        //set the next pointer of newHead to point to the original head
        //this is done first as to not lose the connection to the rest of list
        newHead.next = head;

        //re-assign head to newHead
        head = newHead;
    }

    //inserts data before valueToFind
    public void insertBefore(T data, T valueToFind){
        //insert into an empty list
        if(head.data == null) {
            head = new Node(data);
            return;
        }
        //if the valueToFind is the head, call insert to append before
        if(head.data.equals(valueToFind)) {
            insert(data);
            return;
        }

        current = head;
        while(current.next != null) {
            if (current.next.data.equals((valueToFind))) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }

    //insert data after valueToFind
    public void insertAfter(T data, T valueToFind){
        //insert into an empty list
        if(head == null) {
            head = new Node(data);
            return;
        }

        current = head;
        while(current != null){
            if(current.data.equals(valueToFind)){
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
            }
            current = current.next;
        }
    }

    //includes - returns boolean depending on whether that value exists or not
    public boolean includes(T val){
        //set a pointer to start at head
        current = head;
        //keep traversing if where we are is not null
        while(current != null){
            //if the value is found, stop traversing and return true
            if(current.data.equals(val)) return true;
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
