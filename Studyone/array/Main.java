package array;

public class Main {

    public static void main(String[] args) {

        //测试Array中实现的各个接口

        Array1<Integer> arr = new Array1<Integer>();
        for(int i = 0; i < 10; i++){
            arr.addlLast(i);
        }
        System.out.println(arr);
        //在指定的1的位置，插入元素100
        arr.insert(1,100);
        System.out.println(arr);
        //在首位插入指定元素值3
        arr.insert(0,3);
        System.out.println(arr);
        //测试index非法时的输出
        arr.insert(11,100);
        System.out.println(arr);
        arr.removeElement(3);
        System.out.println(arr);
        arr.delete(2);
        System.out.println(arr);
        arr.removeElement(100);
        System.out.println(arr);
        arr.delete(3);
        System.out.println(arr);

    }

}
