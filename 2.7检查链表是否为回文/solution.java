//反转并比较 先实现链表的反转 然后比较前班部分即可
//迭代法 两个指针 将前半部分入栈 后半部分和出栈比较 入栈的时候根据链表的长度是否已知分为两种情况 一种知道长度 第二种不知道长度的 需要两个指针进行遍历
boolean isPalindrome(LinkedListNode head) {
	LinkedListNode fast = head;
	LinkedListNode slow = slow;
	Stack<Integer> stack = new Stack<Integer>();

	while (fast != null && fast.next != null) {
		stack.push(slow.data);
		slow = slow.next;
		fast = fast.next.next;
	}

	if(fast != null) {
		slow = slow.next;
	}

	while (slow != null) {
		int top = stack.pop().intValue();

		if (top != slow.data) {
			return false;
		}
		slow = slow.next;
	}
	return true;
}

//递归法