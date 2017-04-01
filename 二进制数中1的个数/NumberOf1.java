public class NumberOf1 {
	public static void main(String[] args) {
		System.out.println(numberOf1(8));

	}
	private static int numberOf1 (int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num &= num-1;
		}
		return count;
	}

}