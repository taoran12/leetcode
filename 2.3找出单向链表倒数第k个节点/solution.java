LinkedListNode nthToLast(LinkedListNode head,int k){
	if (k<=0) return null;
	LinkedListNode p1 = head;
	LinkedListNode p2 = head;

	for(int i=0;i<k-1;i++){
		if(p2==null) return null;
		p2 = p2.next;
	}
	if(p2 == null) return null;

	while(p2.next != null){
		p2 = p2.next;
		p1 = p1.next;
	}
	return p1;
}