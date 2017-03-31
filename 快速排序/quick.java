public class quick {
	public static void main (String[] args) {
		int[] list = {1,1,2};
		sort(list);
		for (int i:list) {
			System.out.println(i);
		}
		
	}
	private static void sort (int[] list) {
		int start = 0;
		int end = list.length - 1;
		quickSort(list, start, end);

	}
	private static void quickSort(int[] list, int start, int end) {
		if (start < end) {
			int pivot = partition(list, start, end);
			quickSort(list, start, pivot-1);
			quickSort(list, pivot+1,end);
		}
	}
	private static int partition(int[] list, int start, int end) {
		int pivot = list[start];
		while (start < end) {
			while (start < end && list[end] >= pivot) {
				end--;
			}
			list[start] = list[end];

			while (start < end && list[start] <= pivot) {
				start++;
			}
			list[end] = list[start];

	}
	list[start] = pivot;
	return start;
}
}