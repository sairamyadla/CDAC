import java.util.Stack;

public class Parenthesis {
    public static boolean ispar(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (!stack.empty() && 
                    ((stack.peek() == '(' && ch == ')') ||
                     (stack.peek() == '{' && ch == '}') ||
                     (stack.peek() == '[' && ch == ']'))) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        if (ispar(s)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        String s1 = "([)]";
        if (ispar(s1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
