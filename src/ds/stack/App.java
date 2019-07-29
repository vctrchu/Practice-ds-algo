package ds.stack;

public class App {

	public static void main(String[] args) {
		Stack newStack = new Stack(8);
		newStack.push(12);
		newStack.push(13);
		newStack.push(14);
		newStack.push(19);
		newStack.pop();
		for (int i = 0; i < newStack.newArray.length; i++) {
			System.out.println(newStack.newArray[i]);
		}
		
		System.out.println(newStack.peak());


	}

}
