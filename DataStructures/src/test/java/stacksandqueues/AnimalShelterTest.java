package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void canEnqueue(){
        Queue<String> queue = new Queue<>();
        AnimalShelter<String> animalShelter = new AnimalShelter<>(queue);
        animalShelter.enqueue("capybara");
        animalShelter.enqueue("cat");
        animalShelter.enqueue("dog");

        assertTrue(animalShelter.queue.front.data.equals("capybara"));
    }

    @Test
    public void canDequeueCatOrDog(){
        Queue<String> queue = new Queue<>();
        AnimalShelter<String> animalShelter = new AnimalShelter<>(queue);
        animalShelter.enqueue("capybara");
        animalShelter.enqueue("cat");
        animalShelter.enqueue("dog");

        String result = animalShelter.dequeue("cat");

        assertTrue(result.equals("cat"));
    }

    @Test
    public void canThrowNullIfDequeueNonCatOrDog(){
        Queue<String> queue = new Queue<>();
        AnimalShelter<String> animalShelter = new AnimalShelter<>(queue);
        animalShelter.enqueue("capybara");
        animalShelter.enqueue("cat");
        animalShelter.enqueue("dog");

        assertNull(animalShelter.dequeue("chair"));
    }
}