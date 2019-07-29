package ds.stack;

public class Stack {
	
	//Improvements to code.
	private int size;
	private int top;
	public int [] newArray;
	
	/*
	private int size = -1;
	private int peak = 0;
	public int [] newArray;
	*/
	
	public Stack(int size) {
		this.size = size;
		this.top = -1;       // set top value to -1 instead of 0;
		newArray = new int [size];
	}
	
	public void push(int value) {
		if (top < newArray.length) {
			top++;
			newArray[top] = value;
		}
	}
	
	public int pop() { // pop method sets variable "top" to new index array, this method IS NOT DELETING THE DATA BUT POINTING TO A NEW INDEX
		if (isEmpty()) {
			System.out.println("No values to pop.");
			return -1;
		} else {
			int temp_top = top;
			top--;
			return (newArray[temp_top]);
		}
	}
	
	public int peak() {
		if (isEmpty()) {
			return -1;
		} else {
			return (newArray[top]);
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == size - 1);
	}
	
	
}
