import java.util.*;

 class Exercise {
    public boolean isValid(String s) {
        int MAX = 104; // Constraint limit given

        //If I am checking valid parenthesis , the given string  should always be even (for ex:{},(),[]{}()....)
	   //odd length string will for sure never match the condition...
        if (s.length() % 2 != 0) {
            return false;
        }
		

        Stack<String> stack = new Stack<>();

        for (String str : s.split("")) {
            // an opening bracket is already predefined as ('(','{','[')...if any of this occurs, push() operation performed
            if (str.equals("(") || str.equals("{") || str.equals("[")) {
                if (stack.size() == MAX) { // No elements can be pushed anymore, resulting in stack overflow...
                    System.out.println("Stack Overflow");
                    return false;
                }
                stack.push(str);
            } 
            // when it's a closing bracket, pop () operation performed
            else {
                if (stack.isEmpty()) {
                    System.out.println("Stack Underflow");
                    return false;
                }
                String top = stack.pop();
                if ((str.equals(")") && !top.equals("(")) 
					||(str.equals("}") && !top.equals("{")) 
                    ||(str.equals("]") && !top.equals("["))) 
					{
                    return false;}
                
            }
        }
        // Stack must be empty at the end if the popped closing brackets match with the pushed opening brackets..
        return stack.isEmpty();
    }

}
