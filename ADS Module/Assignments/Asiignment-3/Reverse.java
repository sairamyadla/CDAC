public class Reverse {
    int MAX; 
    int top; 
    char a[]; 

    Reverse(int n) { 
        top = -1;
        MAX=n;
        a=new char[MAX];
    } 

    boolean isEmpty() { 
        return (top < 0); 
    } 

    boolean push(char x) { 
        if (top >= MAX) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } else { 
            a[++top] = x; 
            //System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 

    char pop() { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } else { 
            char x = a[top--]; 
            return x; 
        } 
    }
    public static void reverse(StringBuffer str){
        int n = str.length();
        Reverse obj = new Reverse(n);
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));
 
        
        for (i = 0; i < n; i++) {
            char ch = obj.pop();
            str.setCharAt(i, ch);
        }
    }
     public static void main(String args[]){
        StringBuffer s = new StringBuffer("hello");
        reverse(s);
        System.out.println("Reversed string is " + s);
        StringBuffer s1 = new StringBuffer("world");
        reverse(s1);
        System.out.println("Reversed string is " + s1);
    }
}