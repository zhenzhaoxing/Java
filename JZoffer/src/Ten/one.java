package Ten;

import java.util.ArrayList;
import java.util.Stack;
/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * @author xiang
 *
 */
public class one {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
		//建立一个栈
		Stack<Integer>  st = new Stack<>();
		ArrayList<Integer> list = new ArrayList<>();
		
	while(listNode!=null){
		   
		st.push(listNode.val);
		 listNode=listNode.next;   
	}
		while(!st.empty()){
	    	list.add(st.pop());
	    }
		
		
		
		
		return list;
		
	}
}











