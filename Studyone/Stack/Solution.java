package Stack;

//使用官方逻辑来实现
import java.util.Stack;
//leetcode默认只能提交其规定的主类，若存在自定义类，应作为其主类
public class Solution {


    public boolean isValid(String s){
        ArrayStack<Character> stack = new ArrayStack<Character>();
        for(int i=0;i<s.length();i++){
            //每次检验当前遍历的字符
            char c = s.charAt(i);
            if(c =='[' || c=='(' || c=='{'){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()){
                return false;
                }
                //栈不为空的情况下，检查栈顶元素
                char topchar = stack.pop();
                if(c==']' && topchar !='[') {
                    return false;
                }
                else if (c==')' && topchar !='(') {
                    return false;
                }
                else if(c=='}' && topchar !='{') {
                return false;
                }
            }
        }
        return stack.isEmpty();
    }
    //测试方法可以在Leetcode中保留
    public static void main(String[] args) {
        //编写测试用例
        System.out.println((new Solution()).isValid("(){()"));

    }
}
