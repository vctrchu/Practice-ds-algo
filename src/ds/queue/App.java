package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue newQueue = new Queue(5);
		newQueue.insert(10);
		newQueue.insert(1015);
		newQueue.insert(104);
		newQueue.insert(10);
		newQueue.insert(122);
		newQueue.insert(122);
		newQueue.view();

	}

}
