package algorithm.java.DataStructure.Stack;

public interface Stack<T> {
    boolean isEmpty();
    boolean isFull();
    void push(T item);
    T pop();
    T peek();
    void clear();
}
