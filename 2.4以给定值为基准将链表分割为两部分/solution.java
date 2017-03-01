public LinkListNode partition(LinkListNode node,int x){
	LinkListNode beforeStart = null;
	LinkListNode beforeEnd = null;
	LinkListNode afterStart = null;
	LinkListNode afterEnd = null;

	while(node != null){
		LinkListNode next = node.next;
		node.next = null;

		if(node.data<x){
			if(beforeStart == null){
				beforeStart = node;
				beforeEnd = beforeStart;
			} else{
				beforeEnd.next = node;
				beforeEnd = node;
			}
		} else{
			if (afterStart == null){
				afterStart = node;
				afterEnd = afterStart;
			} else{
				afterEnd.next = node;
				afterEnd = node;
			}
		}

		node = next;
	}

	if (beforeStart == null) {
		return afterStart;
	}
	beforeEnd.next = afterStart;
	return beforeStart;
}

//上面这个解法需要维护四个变量，第二种方法 节点不必追加至before和end链表的末端，而是插入这两个链表的前端

public LinkListNode partition(LinkListNode node,int x){
	LinkListNode beforeStart = null;
	LinkListNode afterStart = null;

	while (node != null){
		LinkListNode next = node.next;
		if (node.data < x){
			node.next = beforeStart;
			beforeStart = node;
		} else {
			node.next = afterStart;
			afterStart = node;
		}
		node = next;
	}
	if (beforeStart == null) {
		return afterStart;
	}
	LinkListNode head = null;
	while (beforeStart.next != null) {
		beforeStart.next = beforeStart;
	}
	beforeStart.next = afterStart;
	return head;


}