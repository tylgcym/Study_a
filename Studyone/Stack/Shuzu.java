package Stack;

public class Shuzu {



    public static void main(String[] args) {
        // 数组使用练习
        int[] arr = new int[20];
        for(int i=0;i<arr.length;i++){
            arr[i] = i;
        }

        int[] arr1 = new int[]{99,100,101};
        //数组输出的方式一
        for(int j=0;j<arr1.length;j++){
            System.out.println(arr1[j]);
        }
        //数组输出的方式二
        for(int n: arr1){
            System.out.println(n);
        }
    }
}
