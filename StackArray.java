import java.util.Arrays;
import java.util.EmptyStackException;

class StackArray{
	private int[]stackArray;
	private int top;
	
	//Constructor 0 args ,name same as class name 
	StackArray(){
		stackArray=new int[10];
		top=-1;
		System.out.println("The array can input 10 elements");
	}
	
	//Constructor overloading with  args ,name same as class name but here parameter is given
	StackArray(int maxSize){
		stackArray=new int[maxSize];
		top=-1;
        System.out.println("The array can input based on user given value of max size ");
	}
	
	
	//operations of stack begins
	
	//1. checking the size of the stack . Now as array starts from 0 index and stack follow
	//LIFO method hence the index of the top keeps incrementing and the size becomes (top+1);
	public int size(){
		return top+1;
	}
	
	//2.push()
	//to push an element we need to check if the stack is having space or not . 
	//hence need to write a method isFull() and isEmpty() before we push or pop an element .
	
	public boolean isFull(){
		return (top==stackArray.length-1);//no space to push an element i.e STACK OVERFLOW
	}
	public boolean isEmpty(){
		return (top==-1);//no element left in the stack to be popped i.e STACK UNDERFLOW
	}
	//now we can push an element .........
	public void push(int x){
		if(isFull()){
			System.out.println("Stack Overflow, no more element can be pushed....");
		return ;
		}
		top+=1;
		stackArray[top]=x;
		}
	//3.pop()
	public int pop(){
		int x;
		if(isEmpty()){
			System.out.println("Stack Underflow.. no element left to be popped...");
			throw new EmptyStackException();
		}
		top-=1;
		x=stackArray[top];
		return x;
	}
	//4.peek()
	//this displays the top element ...
	public int peek(){
		if(isEmpty()){
			System.out.println("Stack Underflow.. no element left to be peeked...");
			throw new EmptyStackException();
			
		}
		return stackArray[top];
	}
	
	//5.display() 
	// this shows the full stack with the number of element inserted as per user.
	
	public void display(){
		if(isEmpty()){
			System.out.println("Stack Underflow.. no element to be displayed...");
			return;
		}
		System.out.println("--------------Stack Array is ----------------");
		for(int i=top;i>=0;i--){
			System.out.println(stackArray[i]+"  ");
		System.out.println();	
		}
	
}}


