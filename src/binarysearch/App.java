package binarysearch;

public class App {

	public static void main(String[] args) {
		int [] array = {1, 2 ,3 ,4 , 5, 6, 10, 12, 50};
		System.out.println(recursiveBinarySearch(5, 0, array.length - 1, array)); 
	}
	
	public static int binarySearch(int value, int [] array) {
		int firstIndex = 0;
		int lastIndex = array.length - 1;
		while (firstIndex < lastIndex) {
			int midIndex = (firstIndex + lastIndex) / 2;
			if (array[midIndex] == value) {
				return midIndex;
			} else if (array[midIndex] > value) {
				lastIndex = midIndex - 1;
			} else {
				firstIndex = midIndex + 1;
			}
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int value, int firstIndex, int lastIndex, int [] array) {
		if (firstIndex > lastIndex) {
			return -1;
		} else {
			int midIndex = (firstIndex + lastIndex) / 2;
			if (array[midIndex] == value) {
				return midIndex;
			} else if (array[midIndex] < value) {
				return recursiveBinarySearch(value, midIndex + 1, lastIndex, array);
			} else {
				return recursiveBinarySearch(value, firstIndex, midIndex - 1, array);
			}
		}
	}
	
//	public static int recursiveBinarySearch(int value, int firstIndex, int lastIndex, int [] array) {
//		int midIndex = (firstIndex + lastIndex) / 2;
//		if (array[midIndex] == value) {
//			return midIndex;
//		} else if (midIndex > value) {
//			return recursiveBinarySearch(value, firstIndex, midIndex - 1, array);
//		} else if (midIndex < value){
//			return recursiveBinarySearch(value, midIndex + 1, lastIndex, array);
//		} else {
//			return -1;
//		}
//	}

}
