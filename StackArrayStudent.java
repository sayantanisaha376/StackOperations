
//CONSTRUCTION OF THE STACK OF Employees

import java.util.EmptyStackException;
class StackArrayStudent
{
	private Student [] stackArray;
	private int top;
	
	
	StackArrayStudent(int maxSize)
	{
		stackArray=new Student[maxSize];
		top=-1;
		System.out.println("array is ready for given no of Employees");
	}


// OPERATION ON STACK CHECKING ON CONDITIONS AND SIZE
    public int size()
	{
		return top+1; // as array is 0 index based
	}
	public boolean isFull()//overflow in stack
	{
		return (top==stackArray.length-1);
	}
	public boolean isEmpty()//underflow in stack
	{
		return (top==-1);
	}


 public void display()
   {
	   if(isEmpty())
	   {
		   System.out.println("Stack UNDERFLOW!!!!!!");
		   return;
	   }
	   System.out.println("-----Array is-----------");
	   for(int i=top;i>=0;i--)
		   System.out.println(stackArray[i]+" ");
	   System.out.println();
   }

	
//OPERATION ON STACK 
  // push an element
   public void push(Student x)
   {
	   if(isFull())
	   {
		   System.out.println("Stack OVERFLOW!!!!!!");
		   return;
	   }
	   top=top+1;
	   stackArray[top]=x;
   }



   //pop 
   public Student pop()
   {
	  Student x;
	   if(isEmpty())
	   {
		   System.out.println("Stack UNDERFLOW!!!!!!");
		   throw new EmptyStackException();
	   }
	   x=stackArray[top];
	   top=top-1;
	   return x;
   }
   
   
   //peek
   public Student peek()
   {
	   if(isEmpty())
	   {
		   System.out.println("Stack UNDERFLOW!!!!!!");
		   throw new EmptyStackException();
	   }
	   return stackArray[top];
   }
   
   // Search for a student by email without removing elements
    public Student searchByEmail(String email) 
	{
        for (int i = top; i >= 0; i--) {
              if (stackArray[i].getEmail().equalsIgnoreCase(email)) {
            return stackArray[i]; // Found
        }
    }
    return null; // Not found
}

   
}

 
	   
   
   
   
	   
   
   
   
   
   
	   
		   
   
	   
		   
	   
   
	
	
	
    

	
	
	
	

