public static void deleteDups(LinkedListNode n){
	HashMap table = new HashMap();
	LinkedListNode previous = null;
	while (n != null){
		if(table.containsKey(n.data)){
			previous.next = n.next;
		}else{
			table.put(n.data,true);
			previous = n
		}
		n = n.next;
	}
}

# 不借助额外缓冲区，可以用两个指针来迭代：current迭代访问整个链表，runner用于检查后续的节点是否重复

public static void deleteDups(LinkedListNode head
	if (head == null) return;
	LinkedListNode current = head;
	while(current != null){
		LinkedListNode runner = current;
		while (runner.next){
			if(current.data == runner.next.data){
				runner.next = runner.next.next;
			}
			else{
				runner = runner.next
			}
		}
		current = curent.next;
}
}