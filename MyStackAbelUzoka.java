// Class: CS 5040    
// Term: Spring 2022
// Name: Uzoka Abel
// Program Number: Assignment 3 - Stack #3
// IDE:  Eclipse, JDK 17.0.2

import java.util.ArrayList;

public class MyStackAbelUzoka <E> extends ArrayList<E>{
	private int top;
	
	MyStackAbelUzoka() {
		top = -1;
	}
		
	public E push(E newElement)throws StackException{
		top++;
		add(top, newElement);
		return newElement;
	}
	
	public E pop()throws StackException{
		if(isEmpty()) {
			throw new StackException ("pop(): Stack is empty");
		}
		E returnData = get(top);
		remove(top);
		top--;
		return returnData;

	}
	
	public E peek(){
		if(isEmpty()) {
			throw new StackException ("peek(): Stack is empty");

		}
		return get(top);		
	}
	
	public int size() {
		return super.size();
	}
	
	public boolean isEmpty() {
		return super.size()==0;
	}
	
	public String toString() {
		return super.toString();				
	}
}
