package arraydsa;

public class Main {
	public static void main(String[] args) {
		MyArray arr = new MyArray(5);
		arr.insert(1);
		arr.insert(2);
		arr.insert(3);
		arr.insert(400);
		arr.insert(5);
		arr.insert(5);
		arr.insert(3);
		System.out.println(arr);
		arr.reverse();
		System.out.println(arr);

	}
}
