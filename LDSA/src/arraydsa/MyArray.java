package arraydsa;

public class MyArray {
	private int[] items;

	private int currentIndex;

	public MyArray(int intialSize) {
		this.items = new int[intialSize];
		this.currentIndex = 0;
	}

	// Insert the array
	public void insert(int value) {
		if (currentIndex == items.length) {
			int[] temp = new int[items.length * 2];
			for (int i = 0; i < currentIndex; i++) {
				temp[i] = items[i];
			}
			items = temp;
		}
		this.items[currentIndex] = value;
		currentIndex++;
	}

	// Searching the array list
	public int indexOf(int value) {
		// Linear search
		for (int i = 0; i < this.currentIndex; i++) {
			if (this.items[i] == value) {
				return i;
			}
		}
		return -1;
	}

	// Remove the array
	public void removeAt(int index) {
		if (index >= this.currentIndex)
			throw new IllegalArgumentException();
		for (int i = index; i <= this.currentIndex - 2; i++) {
			this.items[i] = this.items[i + 1];
		}
		currentIndex--;
		this.items[this.currentIndex] = 0;
	}

	// max of the array
	public int max() {
		int result = this.items[0];
		for (int i = 0; i < this.currentIndex; i++) {
			if (items[i] > result) {
				result = items[i];
			}
		}
		return result;
	}

	// minimum of the array
	public int min() {
		int result = this.items[0];
		for (int i = 0; i < this.currentIndex; i++) {
			if (items[i] < result) {
				result = items[i];
			}
		}
		return result;
	}

	// Reverse Array

	public void reverse() {
		int i = 0;
		int j = this.currentIndex - 1;
		while (i < j) {
			int temp = items[i];
			items[i] = items[j];
			items[j] = temp;
			i++;
			j--;
		}

	}

	// Print the array
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		for (int i = 0; i < this.currentIndex; i++) {
			str.append(this.items[i]);
			if (i < this.currentIndex - 1) {
				str.append(", ");
			}
		}
		str.append("]");
		return str.toString();
	}

}
