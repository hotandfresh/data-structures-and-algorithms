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
        System.out.println(result);
        ArrayList<ArrayList<String>> expected = new ArrayList<>();
        ArrayList<String> individualResults1 = new ArrayList<>(Arrays.asList("fond", "enamored", "averse"));
        ArrayList<String> individualResults2 = new ArrayList<>(Arrays.asList("guide", "user", "follow"));
        ArrayList<String> individualResults3 = new ArrayList<>(Arrays.asList("wrath", "anger", "delight"));
        ArrayList<String> individualResults4 = new ArrayList<>(Arrays.asList("outfit", "garb", "NULL"));
        ArrayList<String> individualResults5 = new ArrayList<>(Arrays.asList("diligent", "employment", "idle"));

        expected.add(individualResults1);
        expected.add(individualResults2);
        expected.add(individualResults3);
        expected.add(individualResults4);
        expected.add(individualResults5);

        assertArrayEquals(expected.get(1), result.get(1));
    }

}