class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; 

    Stack() { 
        top = -1; 
    } 

    boolean isEmpty() { 
        return (top < 0); 
    } 

    boolean push(int x) { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 

    int pop() { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } else { 
            int x = a[top--]; 
            return x; 
        } 
    } 

    int peek() { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } else { 
            int x = a[top]; 
            return x; 
        } 
    } 

    void print() { 
        for (int i = top; i > -1; i--) { 
            System.out.print(" " + a[i]); 
        } 
    } 

    public static void main(String args[]) { 
        Stack s = new Stack(); 
        s.push(5); 
        s.push(3); 
        s.push(7); 
        System.out.print("Elements present in stack:"); 
        s.print(); 
        System.out.println();
        System.out.println("popped element is: "+s.pop()); 
        System.out.print("Elements present in stack:"); 
        s.print();
        System.out.println();
        Stack s1 = new Stack(); 
        s1.push(10); 
        s1.push(20);
        s1.pop(); 
        s1.push(15); 
        System.out.print("Elements present in stack:"); 
        s1.print(); 
        System.out.println();
    } 
}
