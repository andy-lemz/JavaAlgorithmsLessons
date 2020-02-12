package Les3;

public class Stack<T> {
    private int maxSize;
    T[] stack;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.stack = (T[]) new Object[size];
        this.top = -1;
    }

    public void push(T item){
        this.stack[++this.top] = item;
    }

    public T pop(){
        return this.stack[this.top--];
    }

    public T peek(){
        return this.stack[this.top];
    }

    public boolean isEmpty(){
        return (this.top == -1);
    }

    public boolean isFull(){
        return (this.top == this.maxSize-1);
    }
}
