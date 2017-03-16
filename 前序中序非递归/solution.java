//非递归实现二叉树的前序遍历，先把头指针放入栈中，然后pop出来 每次pop出来之后要把他的孩子从右到左放入栈中，然后再pop出来
public void preOrderUnRecur(Node head) {
	System.out.println("pre-order:");
	if (head != null) {
		Stack<Node> stack = new Stack<node>();
		stack.add(head);
		while (!stack.isEmpty()) {
			head = stack.pop();
			System.out.println(head.value + " ");
			if(head.right != null) {
				stack.push(head.right);
			}
			if(head.left != null) {
				stack.push(head.left);
			}
		}
	}
	System.out.println();
}
//中序非递归遍历，把左边的边界都push进去，直到为null，这时候pop出来一个，把他的右孩子push进去，
public void inOrderUnrecur(Node head) {
	System.out.println("in-order:");
	if (head != null) {
		Stack<Node> stack = new Stack<Node>();
		while(!stack.isEmpty() || head != null) {
			if (head != null) {
				stack.push(head);
				head = head.left;
			} else {
				head = stack.pop();
				System.out.println(head.value + "");
				head = head.right;
			}
		}
	}
	System.out.println();
}