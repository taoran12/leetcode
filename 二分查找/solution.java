int binarySearchRecursive(int[] a, int x, int low, int high) {
	if(low > high) {
		return -1;
	}
	int mid = (low+high)/2;
	if(arr[mid] > x){
		binarySearchRecursive(a,x,low,mid-1);
	} else if(arr[mid] < x) {
		binarySearchRecursive(a,x,mid+1,high);
	} else {
		return mid;
	}

}