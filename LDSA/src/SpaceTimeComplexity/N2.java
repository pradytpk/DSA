package SpaceTimeComplexity;

public class N2 {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 5, 30, 10, 50 };
		int tar = 10;

		// find the pairs whose sum is target(10)

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == tar) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}

		}

	}

}
