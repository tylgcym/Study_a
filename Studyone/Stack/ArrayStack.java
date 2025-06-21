package Stack;

public class ArrayStack <E> implements Stack<E> {
    //基于动态数组的Stack并实现了Stack

    Array1<E> array;

    public ArrayStack(int capacity){
        array = new Array1<E>(capacity);
    }

    public ArrayStack(){
        array = new Array1<E>();
    }

    @Override
    public int getSize(){
        return array.getSize();
    }


    @Override
    public boolean isEmpty(){
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public void push(E e){
        array.addlLast(e);
    }


    //Array中的reszie方法也能呗调用
    @Override
    public E pop(){
        return array.deleteLast();
    }

    public E peek(){
        return array.getLast();
    }


    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for(int i=0;i<array.getSize();i++){
            res.append(array.get(i));
            if( i!=array.getSize()-1){
                res.append(",");
            }
        }
        res.append("] top");
        return  res.toString();
    }

}
