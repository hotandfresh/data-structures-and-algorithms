package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void canEnqueueCatOrDog(){
        Queue<String> catQueue = new Queue<>();
        Queue<String> dogQueue = new Queue<>();
        AnimalShelter<String> animalShelter = new AnimalShelter<>(catQueue, dogQueue);
        animalShelter.enqueue("cat");
        animalShelter.enqueue("dog");
        animalShelter.enqueue("dog");
        animalShelter.enqueue("dog");


        assertTrue(animalShelter.dogQueue.front.data.equals("dog"));
        assertTrue(animalShelter.catQueue.front.data.equals("cat"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void cannotEnqueueSomethingOtherThanCatOrDog(){
        Queue<String> catQueue = new Queue<>();
        Queue<String> dogQueue = new Queue<>();
        AnimalShelter<String> animalShelter = new AnimalShelter<>(catQueue, dogQueue);
        animalShelter.enqueue("capybara");
    }

    @Test
    public void canDequeueCatOrDog(){
        Queue<String> catQueue = new Queue<>();
        Queue<String> dogQueue = new Queue<>();
        AnimalShelter<String> animalShelter = new AnimalShelter<>(catQueue, dogQueue);
        animalShelter.enqueue("cat");
        animalShelter.enqueue("dog");
        animalShelter.enqueue("dog");
        animalShelter.enqueue("dog");

        String result = animalShelter.dequeue("cat");

        assertTrue(result.equals("cat"));
    }

    @Test
    public void canThrowNullIfDequeueNonCatOrDog(){
        Queue<String> catQueue = new Queue<>();
        Queue<String> dogQueue = new Queue<>();
        AnimalShelter<String> animalShelter = new AnimalShelter<>(catQueue, dogQueue);
        animalShelter.enqueue("cat");
        animalShelter.enqueue("dog");

        assertNull(animalShelter.dequeue("chair"));
    }
}