package Ten;



public class fannode {
/**
 * 翻转链表 1 2 3 4 5    5 4 3 2 1
 * @param head
 * @return
 */
	public ListNode ReverseList(ListNode head) {
		
	    ListNode dummy = new ListNode(-1);
	    dummy.next=head;
		ListNode tex=head.next;
		ListNode prev = dummy.next;
		ListNode pCur = prev.next;
		  while(pCur!=null){
			 prev.next=pCur.next;
			 pCur.next=dummy.next;
			 dummy.next=pCur;
			 pCur=prev.next;
	
		  }
		return dummy.next;
    }
	
}

