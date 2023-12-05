package numberSystem;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner no = new Scanner(System.in);
		int n = no.nextInt();
		String result = "";
		while (n > 0) {
			int rem = n % 2;
			n = n / 2;
			result = rem + result;
		}
		System.out.println(result);
	}

}
