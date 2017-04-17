public class Test {
	public static void main {

	}

	private Boolean HasSubtree(BinaryTreeNode node1, BinaryTreeNode node2){
		Boolean result = false;

		if(root1 != null && root2 != null){
			if (root1.val == root.val){
				result = DoesTree1HaveTree2(root1, root2);

			}
			if (!result){
				result = HasSubtree(root1.left, root2);
			}
			if (!result){
				result = HasSubtree(root1.right, root2);
		}
		return result;
	}

	private Boolean DoesTree1HaveTree2(BinaryTreeNode root1, BinaryTreeNode root2){
		if (root2 == null){
			return true;
		}
		if (root1 == null){
			return false;
		}

		if (root1.val != root2.val){
			return false;
		}

		return DoesTree1HaveTree2(root1.left,root2.left) && DoesTree1HaveTree2(root1.right, root2.right);
	}
}