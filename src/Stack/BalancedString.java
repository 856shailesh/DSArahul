package Stack;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) throws Exception {
        String str = "{}";
        System.out.println(" String is " + isBalanced(str));

    }

    private static boolean isBalanced(String s) throws Exception {
        Stack stack = new Stack();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                if (c == ')' || c == '}' || c == ']')
                {
                    Character top = (char) stack.pop();
                    if ((top == '(' && c != ')') || (top == '{' && c != '}')
                            || (top == '[' && c != ']'))
                    {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
