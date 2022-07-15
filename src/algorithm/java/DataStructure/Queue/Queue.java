package algorithm.java.DataStructure.Queue;

public interface Queue<T> {
    boolean isEmpty();
    boolean isFull();
    void enqueue(T item);
    T dequeue();
    T peek();
    void clear();
}
