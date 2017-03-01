public static int checkHeight(TreeNode root) {
	if (root == null) {
		return 0;
	}
	int leftHeight = checkHeight(root.left);
	if (leftHeight == -1) {
		return -1;
	}
	int rightHeight = checkHeight(root.right);
	if (rightHeight == -1) {
		return -1;
	}

	int heightDiff = leftHeight - rightHeight;
	if (Math.abs(heightDiff) > 1) {
		return -1
	} else {
		return Math.max(leftHeight. rightHeight) + 1;
	}

}

public static boolean isBalanced(TreeNode root) {
	if (checkHeight(root) == -1) {
		return false;
	} else {
		return true;
	}
}