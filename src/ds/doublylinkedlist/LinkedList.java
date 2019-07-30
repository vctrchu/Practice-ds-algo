package ds.doublylinkedlist;

public class LinkedList {
	
	private Node first;
	private Node last;
	
	public void insertFront(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			first = newNode;
		} else {
			first.previous = newNode;
		}
		newNode.next = first;
		first = newNode;
	}
	
	public void insertRear(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			last = newNode;
		} else {
			last.next = newNode;
		}
		newNode.previous = last;
		last = newNode;
	}
	
	public boolean insertAfter(int key, int data) {
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}
		
		Node newNode = new Node(data);
		if (current == last) { // We have to check this because we are inserting AFTER which makes us set a new LAST reference
			last = newNode;
		} else {
			newNode.next = current.next;
			current.next.previous = newNode;
		}
		newNode.previous = current;
		current.next = newNode;
		return true;
	}
	
	public boolean deleteNode(int key) {
		Node current = first;
		while (current.data != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}
		
		if (current == first) {
			first = current.next;
		} else if (current == last) {
			last = last.previous;
		} 
		current.previous.next = current.next;
		current.next.previous = current.previous;
		return true;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	
}
