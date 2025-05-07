



import java.util.Stack;
public class built_in_stack{
    public static void main(String[]args)
    {
      Stack<Integer> stack = new Stack<>(); 
     stack.push(10);
     stack.push(23);
     stack.push(11);
     stack.push(10);
     stack.push(190);
     stack.push(234);
     stack.push(1078);
     stack.push(10);
     System.out.println(stack);
     stack.pop();
     stack.pop();
     System.out.println(stack.peek());
     System.out.println(stack.isEmpty());
     System.out.println(stack.search(10));

   
       
    }
}