class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        if(top==-1)
        return true;

        return false;
    } 

    Stack() 
    { 
        top =-1;
    } 
  
    boolean push(int x) 
    { 
        if(top >= MAX) {
			
			return true;
		}
		
        top = top +1;
        a[top] = x;
			return false;
		}
    
  
    int pop() 
    { 
     if(top==-1) {
			
			System.out.println("Stack Underflow ");
			return 0;	
		}
        top = top -1;
        return a[top+1];
        }
  
    int peek() 
    { 
        return a[top];	
    } 
} 
  
// Driver code 
public class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}