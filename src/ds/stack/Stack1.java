package ds.stack;

public class Stack1 {

	private int top;
	private int maxSize;
	public int [] newArray;
	
	public Stack1(int maxSize) {
		this.maxSize = maxSize;
		top = -1;
		newArray = new int [maxSize];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize -1);
	}
	
	public boolean push(int value) {
		if (isFull()) {
			return false;
		} else {
			top ++;
			newArray[top] = value;
			return true;
		}
	}
	
	public boolean pop() {
		if (isEmpty()) {
			return false;
		} else {
			top --;
			return true;
		}
	}
}
