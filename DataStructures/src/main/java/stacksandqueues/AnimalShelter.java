package stacksandqueues;

public class AnimalShelter<T> {
    public Queue<T> queue;

    public AnimalShelter(Queue<T> queue){
        this.queue = queue;
    }

    public void enqueue(T data){
        this.queue.enqueue(data);
    }

    public T dequeue(T pref){
        while(this.queue.front != null){
            if(pref.equals(this.queue.front.data)){
                return this.queue.dequeue();
            }

            this.queue.front = this.queue.front.next;
        }
        return null;
    }
}
