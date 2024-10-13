import java.util.Stack;

public class Infix {
        static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '%' || c == '^');
    }
    static int precedence(char c) {
        switch(c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '^':  
                return 3;
        }
        return -1;
    }
    static String infix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            
            if (Character.isLetter(c)) {
                result.append(c);
            }
            else if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); 
            }
            else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    if (c == '^' && stack.peek() == '^') break; 
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        String infix1 = "A+B*C";
        System.out.println(infix(infix1));
        String infix2 = "A*B+C/D";
        System.out.println(infix(infix2));
    }
}
