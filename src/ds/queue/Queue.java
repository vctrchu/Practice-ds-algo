package ds.queue;

public class Queue {
	
	private int maxSize;
	private int front;
	private int rear;
	private int nItems; // maintain the number of items in our queue
	private int [] newArray;
	
	public Queue (int maxSize) {
		this.maxSize = maxSize;
		front = 0;
		rear = -1;
		nItems = 0;
		this.newArray = new int [maxSize];
	}
	
	public void insert(int value) {
		if (isFull()) {
			System.out.println("Queue is full.");
		} else {
			rear ++;
			nItems ++;
			newArray[rear] = value;
		}
	}
	
	public void remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
		} else {
			front ++;
			nItems --;
		}
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize);
	}
	
	public void view() {
		System.out.print("[ ");
		for (int i = 0; i< newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
		System.out.println("]");
	}
}
