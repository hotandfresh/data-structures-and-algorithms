package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void canInstantiateEmptyLL(){
        LinkedList newLL = new LinkedList();

        //the head of an empty linkedList will be null
        assertTrue(newLL.head == null);
    }

    @Test
    public void canInsertIntoLL(){
        LinkedList newLL = new LinkedList();
        newLL.insert(10);

        //if the LL is only 1 Node long, that Node will be the head
        assertTrue(newLL.head.data == 10);

    }

    @Test
    public void headPointsToFirstNode(){
        LinkedList newLL = new LinkedList();
        newLL.insert(10);
        newLL.insert(1);
        newLL.insert(110);
        newLL.insert(1011);

        //since this is the last value added, it'll be the head:
        newLL.insert(101);

        assertTrue(newLL.head.data == 101);
    }

    @Test
    public void canInsertMultipleNodes(){
        LinkedList newLL = new LinkedList();
        newLL.insert(10);
        newLL.insert(1);
        newLL.insert(110);
        newLL.insert(1011);
        newLL.insert(101);

        int total = 0;
        newLL.current = newLL.head;
        while(newLL.current != null){
            total++;
            newLL.current = newLL.current.next;
        }

        //check if the length is the same as the number of Nodes that were added
        assertTrue(total == 5);
    }

    //    Will return true when finding a value within the linked list that exists
    @Test
    public void canFindValueInLL(){
        LinkedList newLL = new LinkedList();
        newLL.insert(10);
        newLL.insert(1);
        newLL.insert(110);
        newLL.insert(1011);
        newLL.insert(101);

        assertTrue(newLL.includes(101));
    }

    //    Will return false when searching for a value in the linked list that does not exist
    @Test
    public void canFindIfValueIsNotInLL(){
        LinkedList newLL = new LinkedList();
        newLL.insert(10);
        newLL.insert(1);
        newLL.insert(110);
        newLL.insert(1011);
        newLL.insert(101);

        assertFalse(newLL.includes(666));
    }

    //    Can properly return a collection of all the values that exist in the linked list
    @Test
    public void canPrintAllValuesInLL(){
        LinkedList newLL = new LinkedList();
        newLL.insert(10);
        newLL.insert(1);
        newLL.insert(110);
        newLL.insert(1011);
        newLL.insert(101);

        String result = newLL.toString();
        assertEquals("101 1011 110 1 10 ", result);
    }
}