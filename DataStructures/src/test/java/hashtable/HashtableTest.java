package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    @Test
    public void canAddtoHashTable(){
       Hashtable ht = new Hashtable();
       ht.add("cat", 50);

       assertEquals(ht.get("cat"), 50);
    }

    @Test
    public void canRetrieveValueFromKey(){
        Hashtable ht = new Hashtable();
        ht.add("cat", 50);
        int expected = ht.get("cat");

        assertEquals(expected, 50);
    }

    @Test(expected = NullPointerException.class)
    public void canReturnNullForAKeyThatDoesNotExist(){
        Hashtable ht = new Hashtable();
        ht.add("cat", 50);

        ht.get("tacocat");
    }

    @Test
    public void canHandleCollision(){
        Hashtable ht = new Hashtable();
        //these two words have the same hash and will the following values stored in the same index
        ht.add("dog", 100);
        ht.add("god", 99);
        //the get method will be able to look through every node and find the value
        assertEquals(ht.get("dog"), 100);
        assertEquals(ht.get("god"),99);
    }

    @Test
    public void canRetrieveValueThatHasACollision(){
        Hashtable ht = new Hashtable();
        ht.add("cat", 100);
        ht.add("act", 99);

        assertEquals(ht.get("act"), 99);
    }

    @Test
    public void canHashKeyWithinRange(){
        Hashtable ht = new Hashtable();
        int catHash = ht.hash("cat");
        int xzvczxvzxcvzxcvcxzVAL = ht.hash("xzvczxvzxcvzxcvcxz");

        int min = 0;
        int max = 2048;

        assertTrue(min <= catHash && catHash <= max);
        assertTrue((min <= xzvczxvzxcvzxcvcxzVAL) && (xzvczxvzxcvzxcvcxzVAL <= max));
    }
}