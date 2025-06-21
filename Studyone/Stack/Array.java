package Stack;

public class Array {

    private int[] data;
    private int size; //number
    //size作为数组末尾进行维护
    /**/

    //构造函数传入数组容量
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    //无参构造函数,默认数组容量为capacity=10
    public Array(){
        this(10);
    }

    //查询
    public int getSize(int index){
        return size;
    }
    //获取数组容量
    public int getCapacity(){
        return data.length;
    }
    //判断数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }


    public void addlLast(int e){

        insert(size,e);

    }

    public void addFirst(int e){
        insert(0,e);
    }

    //向指定位置插入元素 将指定元素插入到指定位置

    public void insert(int index,int e){
        //判断index是否合法
        if(index<0||index>size){
            throw new IllegalArgumentException("AddLast failed.Index Error");
        }
        //将插入位置及以后位置的元素全部向后移一位，再将e插入到指定位置，size++
        if(size==data.length) {
            throw new IllegalArgumentException("AddLast failed.Array is full");
        }
        //首先判断元素是否已满，未满则可以插入
        for(int i=size-1;i>=index;i--){
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;

    }


    //该函数实现获取index位置的元素
    int get(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("Get failed.Index is illegal");
        }
        return data[index];
    }

    //set方法，更新数组中某一个index位置的元素更新为传入的元素
    void set(int index,int e){
        if(index<0||index>=size){
            throw new IllegalArgumentException("Set failed.Index is illegal");
        }
        data[index] = e;
    }

    //查找数组中是否存在元素e
    public boolean contains(int e){

        for(int i=0;i<size;i++){
            if(data[i]==e){
                return true;
            }

        }
        return false;

    }

    //该方法作用是查找元素e所在的索引
    public int find(int e){
        for(int i=0;i<size;i++){
            if(data[i]==e){
                return i;
            }
        }
        return -1;
    }

    //该方法的作用是删除数组中指定位置的元素,并将其返回
    public int delete(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("Delete failed.Index is illegal");
        }

        int res = data[index];
        for(int i=index;i<size;i++){
            data[i] = data[i+1];
        }
        size--;
        return res;
    }

    //删除数组中最后一个元素
    public int deleteLast(){
        return delete(size-1);
    }

    //尝试删除某一指定元素值
    public void removeElement(int e){
        int index = find(e);
        if(index !=-1){
            delete(index);

        }
    }

    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array size = %d,capacity = %d\n",size,data.length));
        res.append('[');
        for(int i=0;i<size;i++){
            res.append(data[i]);
            //如果当前元素不是最后一个元素
            if(i!=size-1){
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }



}
