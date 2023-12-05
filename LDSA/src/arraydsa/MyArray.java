package arraydsa;

public class MyArray {
	private int[] items;

	private int currentIndex;

	public MyArray(int intialSize) {
		this.items = new int[intialSize];
		this.currentIndex = 0;
	}

	public void insert(int value) {
		this.items[currentIndex] = value;
		currentIndex++;
	}

	public int indexOf(int value) {
		// Linear search
		for (int i = 0; i < this.currentIndex; i++) {
			if (this.items[i] == value) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("[");
		for (int i : items) {
			str.append(i).append(", ");
		}
		str.append("\b").append("\b").append("]");
		return str.toString();
	}
}
