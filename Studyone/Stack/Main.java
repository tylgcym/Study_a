package Stack;

public class Main {

    public static void main(String[] args) {

        //测试Array中实现的各个接口

        ArrayStack<Integer> stack = new ArrayStack<Integer>();
        //向数组中添加元素
        for(int i=0;i<5;i++){
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);


    }

}
