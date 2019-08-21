package stacksandqueues;

import java.io.InvalidObjectException;

public class AnimalShelter<T> {
    public Queue<T> dogQueue;
    public Queue<T> catQueue;

    public AnimalShelter(Queue<T> catQueue, Queue<T> dogQueue){
        this.catQueue = catQueue;
        this.dogQueue = dogQueue;
    }

    public void enqueue(T animal){
        if(animal.equals("cat")){
            this.catQueue.enqueue(animal);
        } else if(animal.equals("dog")){
            this.dogQueue.enqueue(animal);
        } else {
            throw new IllegalArgumentException("This shelter only excepts dogs and cats");
        }
    }

    public T dequeue(T pref){
        if(pref.equals("cat")){
            return this.catQueue.dequeue();
        } else if(pref.equals("dog")){
            return this.dogQueue.dequeue();
        }
        return null;
    }
}
