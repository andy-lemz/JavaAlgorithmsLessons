package Les3;

public class Deque<T> {
    private int maxSize;
    private T[] deque;
    private int front;
    private int rear;
    private int items;

    public Deque(int s){
        maxSize = s;
        deque = (T[]) new Object[maxSize];
        front = 0;
        rear = 0;
        items = 0;
    }
    public void insertLeft(T item){
        if(++rear == maxSize){
            rear = 0;
        }
        deque[rear] = item;
        items++;
    }

    public void insertRight(T item){
        deque[front] = item;
        if (--front < 0){
            front = maxSize-1;
        }
        items++;
    }

    public T removeLeft(){
        if(++front == maxSize){
            front = 0;
        }
       return deque[front];
    }

    public T removeRight(){
        T temp = deque[front++];
        if(front == maxSize)
            front = 0;
        items--;
        return temp;
    }

    public T peek(){
        return deque[front];
    }
    public boolean isEmpty(){
        return (items==0);
    }

    public boolean isFull(){
        return (items==maxSize);
    }

    public int size(){
        return items;
    }
}
