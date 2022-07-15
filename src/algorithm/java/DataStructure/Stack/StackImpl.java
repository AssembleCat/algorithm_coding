package algorithm.java.DataStructure.Stack;

public class StackImpl<T> implements Stack<T>{

    private int top;
    private final int stackSize;
    private T[] stackArr;

    public StackImpl(int stackSize){
        this.stackSize = stackSize;
        top =-1;
        stackArr = (T[]) new Object[this.stackSize];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == this.stackSize-1);
    }

    public void push(T item) {
        if(isFull()) return;
        stackArr[++top] = item;
    }

    public T pop() {
        if(isEmpty()) return null;
        return stackArr[top--];
    }

    public T peek() {
        if(isEmpty()) return null;
        return stackArr[top];
    }

    public void clear() {
        top = -1;
        stackArr = (T[]) new Object[this.stackSize];
    }
}
