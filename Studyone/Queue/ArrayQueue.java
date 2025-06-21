package Queue;

public class ArrayQueue<E> implements Queue <E>{

    private Array1<E> array;
    public ArrayQueue(int capacity){
        array = new Array1<E>(capacity);
    }

    public ArrayQueue(){
        array = new Array1<E>();
    }

    public int getSize(){
        return array.getSize();
    }

    public boolean isEmpty(){
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    //向队列中添加元素
    @Override
    public void enqueue(E e){
        array.addlLast(e);
    }

    public E dequeue(){
        return array.delete(0);
    }

    @Override
    public E getFront(){
        return array.get(0);
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front[");
        for(int i=0;i<array.getSize();i++){
            res.append(array.get(i));
            if( i!=array.getSize()-1){
                res.append(",");
            }
        }
        res.append("]tail");
        return  res.toString();
    }

    //测试用例
    public static void main(String[] args) {

        ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
        for(int i=0;i<10;i++){
            queue.enqueue(i);
            System.out.println(queue);

            if(i%3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
