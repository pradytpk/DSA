package SpaceTimeComplexity;

public class Logn {

	public static void main(String[] args) {
		// Binary Search
		int[] arr = new int[] { 2, 5, 30, 40, 50 };

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == 40) {
//				System.out.println("index " + i);
//			}
//		}
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == 40) {
				System.out.println("at index " + mid);
				break;
			} else if (arr[mid] < 40) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
	}

}
