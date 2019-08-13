package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void canInstantiateEmptyLL(){
        LinkedList<Integer> newLL = new LinkedList<>();

        //the head of an empty linkedList will be null
        assertTrue(newLL.head == null);
    }

    @Test
    public void canInsertIntoLL(){
        LinkedList<Integer> newLL = new LinkedList<>();
        newLL.insert(10);

        //if the LL is only 1 Node long, that Node will be the head
        assertTrue(newLL.head.data.equals(10));

    }

    @Test
    public void headPointsToFirstNode(){
        LinkedList<Integer> newLL = new LinkedList<>();
        newLL.insert(10);
        newLL.insert(1);
        newLL.insert(110);
        newLL.insert(1011);

        //since this is the last value added, it'll be the head:
        newLL.insert(101);

        assertTrue(newLL.head.data.equals(101));
    }

    @Test
    public void canInsertMultipleNodes(){
        LinkedList<Integer> newLL = new LinkedList<>();
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

    @Test
    public void canFindValueInLL(){
        LinkedList<Integer> newLL = new LinkedList<>();
        newLL.insert(10);
        newLL.insert(1);
        newLL.insert(110);
        newLL.insert(1011);
        newLL.insert(101);

        assertTrue(newLL.includes(101));
    }

    @Test
    public void canFindIfValueIsNotInLL(){
        LinkedList<Integer> newLL = new LinkedList<>();
        newLL.insert(10);
        newLL.insert(1);
        newLL.insert(110);
        newLL.insert(1011);
        newLL.insert(101);

        assertFalse(newLL.includes(666));
    }

    @Test
    public void canPrintAllValuesInLL(){
        LinkedList<Integer> newLL = new LinkedList<>();
        newLL.insert(10);
        newLL.insert(1);
        newLL.insert(110);
        newLL.insert(1011);
        newLL.insert(101);

        String result = newLL.toString();
        assertEquals("101 1011 110 1 10 ", result);
    }

    @Test
    public void canAppend(){
        LinkedList<Integer> newLL = new LinkedList<>();
        //This value will be the head value:
        newLL.append(10);

        //These will be the nodes after the head
        newLL.append(1);
        newLL.append(110);
        newLL.append(1011);
        newLL.append(101);

        assertTrue(newLL.head.data.equals(10));
    }

    @Test
    public void canInsertBefore(){
        LinkedList<Integer> newLL = new LinkedList<>();
        newLL.append(10);
        newLL.append(1);
        newLL.append(110);
        newLL.append(1011);
        newLL.append(101);

        newLL.insertBefore(666, 10);
        String result = newLL.toString();
        assertEquals("666 10 1 110 1011 101 ", result);
    }

    @Test
    public void canInsertAfter(){
        LinkedList<Integer> newLL = new LinkedList<>();
        newLL.append(10);
        newLL.append(1);
        newLL.append(110);
        newLL.append(1011);
        newLL.append(101);

        newLL.insertAfter(666, 101);
        String result = newLL.toString();
        assertEquals("10 1 110 1011 101 666 ", result);
    }
}