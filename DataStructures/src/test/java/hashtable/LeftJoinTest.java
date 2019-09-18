package hashtable;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void canLeftJoinTwoTables(){
        Hashtable<String> ht1 = new Hashtable<>();
        Hashtable<String> ht2 = new Hashtable<>();

        ht1.add("fond", "enamored");
        ht1.add("wrath", "anger");
        ht1.add("diligent", "employment");
        ht1.add("outfit", "garb");
        ht1.add("guide", "usher");

        ht2.add("fond", "averse");
        ht2.add("wrath", "delight");
        ht2.add("diligent", "idle");
        ht2.add("guide", "follow");
        ht2.add("flow", "jam");

        LeftJoin lj = new LeftJoin();
        ArrayList<ArrayList<String>> result = lj.leftJoin(ht1, ht2);

        assertEquals("[[fond, enamored, averse], [guide, usher, follow], [wrath, anger, delight], [outfit, garb, NULL], [diligent, employment, idle]]", result.toString());
    }

}