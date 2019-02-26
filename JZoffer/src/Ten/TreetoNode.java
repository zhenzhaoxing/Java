package Ten;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * 
 * @author xiang
 *
 */
public class TreetoNode {

	public TreeNode Convert(TreeNode pRootOfTree) {
		Queue<TreeNode> qu = new LinkedList<>();
		//调用方法 入队列
     	pint(qu, pRootOfTree);
		//判断是不是为空
		if (qu.isEmpty())
			return pRootOfTree;
        //第一个节点 前面为null 也就是 left 右边为right 
		pRootOfTree = qu.poll();
		
		TreeNode pre = pRootOfTree;
		
		pre.left = null;
	    //下一位
		TreeNode cur = null;
		while (!qu.isEmpty()) {
			cur = qu.poll();
			pre.right = cur;
			cur.left = pre;

			pre = cur;

		}
		//到最后 pre的right（后）为null
		pre.right = null;

		return pRootOfTree;

	}

	// 中序遍历 吧每个节点顺序存储在队列中
	public static void pint(Queue<TreeNode> qu, TreeNode root) {

		if (root == null) {
			return;
		}
		pint(qu, root.left);
		qu.offer(root);
		pint(qu, root.right);

	}
public static void main(String[] args) {
	Queue<Integer> qu = new LinkedList<>();
	qu.offer(10);
	qu.offer(40);
	qu.offer(60);
	
	System.out.println(qu.poll());
	
}
}

/*
 * class TreeNode { int val = 0; TreeNode left = null; TreeNode right = null;
 * 
 * public TreeNode(int val) { this.val = val;
 * 
 * }
 */
