package Queue;

public class loopQueue <E>  implements Queue<E> {

    private E[] data;
    private int front,tail;
    private int size;

    public loopQueue(int capacity){
        data = (E[]) new Object[capacity+1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public loopQueue(){
        this(10);
    }

    public int getCapacity(){
        return data.length-1;// 数组中有一个单位被显示浪费，用来
    }
    @Override
    public boolean isEmpty(){
        return front == tail;
    }

    @Override
    public int getSize(){
        return size;
    }


    @Override
    public void enqueue(E e){

        //判断队列是否已满，若已满，需要扩容
        if((tail+1)%data.length == front){
            resize(getCapacity()*2);
        }

        data[tail++] = e;

    }


    public void resize(int newCapacity){

        E[] newData = (E[])new Object[newCapacity+1];
        for(int i = 0;i<size;i++){
            newData[i] = data[(front+i)%data.length];
        }
        data = newData;
        front = 0;
        tail = size;

    }
    @Override
    public E dequeue(){
        //判断此刻队列是否为空
        if(isEmpty()){
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }

        E res = data[front];
        data[front] = null;
        //更新front的位置下标
        front = (front+1)%data.length;
        //返回出队元素
        //补充一个缩减对垒的方法
        if(size == getCapacity()/4 && getCapacity()/2!=0){
            //缩容时要注意缩容是否可行
            resize(getCapacity()/2);
        }

        return res;


    }

    @Override
    public E getFront(){
        if(isEmpty()){
            throw new IllegalArgumentException("Cannot get from an empty queue.");
        }
        return data[front];
    }


    @Override
    public String toString(){


        //队列数据的toString方法实现
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue Size = %d, capacity = %d",size,getCapacity()));
        System.out.println();
        res.append("[");
        for(int i = front;i!=tail;i = (i+1)%data.length){
            res.append(data[i]);
            if((i+1)% data.length!=tail){
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }


    public static void main(String[] args) {
        loopQueue<Integer> loopQueue = new loopQueue<Integer>();
        for(int i = 0;i<10;i++){
            loopQueue.enqueue(i);
            System.out.println(loopQueue);

            if(i%3==2){
                loopQueue.dequeue();
                System.out.println(loopQueue);
            }
        }
        loopQueue.toString();

    }
}
