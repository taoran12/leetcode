public class jumpFloor {
	public static void main(String[] args) {
		System.out.println(stepFloor(5));

	}

	private static int stepFloor(int num) {
		if (num < 2) {
			return num;
		}
		int f1 = 1;
		int f2 = 0;
		int f = 0;

		for (int i = 1; i <=num; i++) {
			f = f1 + f2;
			f2 = f1;
			f1 = f;
			}
		return f;
	}
}