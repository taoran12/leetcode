//解法一：中序遍历为一个数组，然后判读数组是否有序
public static int index = 0;
public static void copyBST(TreeNode root,int[] array) {
	if (root == null) return;
	copyBST(root.left, array);
	array[index] = root.data;
	index++;
	copyBST(root.right, array);
}

public static boolean checkBST(TreeNode root) {
	int[] array = new int[root.size];
	copyBST(root, array);
	for (int i=0;i<array.length;i++) {
		if (array[i] <= array[i-1]) return false;
	}
	return true;
}

//解法二 利用成为二叉树的条件：所有左边的节点必须小于或等于当前节点，而当前节点必须小于所有右边节点
boolean checkBST(TreeNode n) {
	return checkBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE);
}
boolean checkBST(TreeNode n, int min, int max) {
	if (n==null) {
		return true;
	}
	if (n.data<min || n.data >=max){
		return false;
	}

	if(!checkBST(n.left,min,n.data) || !checkBST(n.right, n.data,max)) {
		return false;
	}
	return true;
}