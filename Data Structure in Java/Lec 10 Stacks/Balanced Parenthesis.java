import java.util.*;
public class Solution {

    public static boolean isBalanced(String expression) {
        //Your code goes here
         if (expression.isEmpty())
           return true;
        
       Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < expression.length(); i++)
        {
            char temp = expression.charAt(i);
            if (temp == '{' || temp == '(' || temp == '[')
            {
                stack.push(temp);
            }
            if (temp == '}' || temp == ')' || temp == ']')
            {
                if (stack.isEmpty())
                    return false;
                char last = stack.peek();
                if (temp == '}' && last == '{' || temp == ')' && last == '(' || temp == ']' && last == '[')
                    stack.pop();
                else 
                    return false;
            }
        }
        return stack.isEmpty()?true:false;
        
    }
}
