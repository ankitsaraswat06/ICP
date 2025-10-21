import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        return RPN(tokens);
    }
    public static int RPN(String[] tokens){
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch = tokens[i];
            if(ch.equals("+")){
                s.push(s.pop() + s.pop());
            }else if(ch.equals("-")){
                int b = s.pop();
                int a = s.pop();
                s.push(a-b);
            }else if(ch.equals("*")){
                s.push(s.pop()*s.pop());
            }else if(ch.equals("/")){
                int b = s.pop();
                int a = s.pop();
                s.push(a/b);
            }else{
                s.push(Integer.parseInt(ch));
            }
        }
        return s.peek();
    }
}
 