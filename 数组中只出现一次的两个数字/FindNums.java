public class FindNums {
	public static void main (String[] args) {
		int[] numbers = new int[]{1,1,2,2,3,3,4,4,5,6};
		int[] rest = new int[2];
		rest = findTwoNums(numbers);
		System.out.println(rest[0]);
		System.out.println(rest[1]);
	}

	private static int[] findTwoNums(int[] nums){
		int[] res = new int[2];
		int num1 = 0;
		int num2 = 0;
		int resultExclusiveOr = 0;
		int indexOf1 = 0;
		int length = nums.length;
		for (int i=0;i<length;i++) {
			resultExclusiveOr ^= nums[i];
		}

		indexOf1 = findFirstBitIs1(resultExclusiveOr);

		for (int j=0;j<length;j++) {
			if (isBit1(nums[j],indexOf1)) {
				num1 ^= nums[j];
			}else {
				num2 ^= nums[j];
			}
		}
		res[0] = num1;
		res[1] = num2;
		return res;
	}
	//找到最右边是1的位
	private static int findFirstBitIs1(int num) {
		int indexBit = 0;
		while ((num & 1) == 0) {
			num = num >> 1;
			++ indexBit;
		}
		return indexBit;
	}
    // 判断num的从右边数起第indexBit位是不是1
	private static Boolean isBit1(int num, int indexBit) {
		num = num >> indexBit;
		if ((num & 1) == 1) {
			return true;
		} else {
			return false;
		}
	}
}