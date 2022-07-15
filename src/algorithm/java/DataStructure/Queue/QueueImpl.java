package algorithm.java.DataStructure.Queue;

public class QueueImpl<T> implements Queue<T> {
    int front;
    int rear;
    int queSize;
    T[] que;
    
    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }
    
    public void enqueue(T item) {
    }
    
    public T dequeue() {
        return null;
    }
    
    public T peek() {
        return null;
    }
    
    public void clear() {
    }
}
