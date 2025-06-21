package Queue;

public interface Queue<E> {
    //这个代码中实现队列的接口
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
