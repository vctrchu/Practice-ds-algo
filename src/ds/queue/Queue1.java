package ds.queue;

public class Queue1 {

	private int maxSize;
	private int first;
	private int last;
	private int nItems;
	private int [] queueArray;
	
	public Queue1(int maxSize) {
		this.maxSize = maxSize;
		nItems = 0;
		first = 0;
		last = -1;
		queueArray = new int [maxSize];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean isFull() {
		return (nItems == maxSize -1);
	}
	
	public boolean insert(int value) {
		if (isFull()) {
			return false;
		} else {
			nItems ++;
			last ++;
			queueArray[last] = value; 
			return true;
		}
	}
	
	public boolean remove() {
		if (isEmpty()) {
			return false;
		} else {
			nItems --;
			first ++ ; // the new index position of first in line;
			return true;
		}
	}
}
