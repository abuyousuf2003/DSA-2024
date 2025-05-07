import java.util.ArrayList;

class builtStack{
   
    int size; 
    ArrayList<Double>stack =new ArrayList<>();
    builtStack(int size)
    {
this.size=size;
    }
    void push(double item)
    {
        if(stack.size()<size)stack.add(item);
         else System.out.println("Stack Overflow");
    }
    void pop()
    {
     if(!stack.isEmpty())
     {
       stack.remove(stack.size()-1);
     }
    }
    double peek() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
}
String display()
{
    return stack.toString();
}

}

public class manual__with_array {
   public static void main(String[]args)
   {
builtStack stackInput = new builtStack(10);
stackInput.push(10);
stackInput.push(19);
stackInput.push(15);
stackInput.push(11);
stackInput.push(190);
System.out.println("Display 1");
System.out.println(stackInput.display());
stackInput.pop();
stackInput.peek();
stackInput.pop();
stackInput.pop();
stackInput.pop();
System.out.println("Display 2");
System.out.println(stackInput.display());
stackInput.pop();
System.out.println("Display 3");
System.out.println(stackInput.display());
System.out.println(stackInput.peek());
   } 
}
