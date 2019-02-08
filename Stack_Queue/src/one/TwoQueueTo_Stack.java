package one;
/**
 * 用两个队列实现栈
 * @author xiang
 *
 */

import java.util.ArrayDeque;
import java.util.Queue;

public class TwoQueueTo_Stack {

	private Queue<Integer> queue = new ArrayDeque<>();
	private Queue<Integer> help = new ArrayDeque<>();

	// 向队列添加元素
	public void push(int value) {
		queue.add(value);
	}
    
	//弹出元素 不保留被弹出的元素
	public int pop() {
		if (queue.isEmpty()) {
			throw new RuntimeException("the queue is empty");
		}

		while (queue.size() != 1) {
			help.add(queue.poll());
		}
		int res = queue.poll();
		swap();// 让 queue和 help交换
		return res;

	}
     // 弹出元素 保留被弹出的元素
	public int peep() {
		if (queue.isEmpty()) {
			throw new RuntimeException("the queue is empty");
		}

		while (queue.size() != 1) {
			help.add(queue.poll());
		}
		int res = queue.poll();
	    help.add(res);
		swap();// 让 queue和 help交换
		return res;

	}
	//两个引用交换 这样就形成了
	private void swap() {
		Queue<Integer> tmp = help;
		help = queue;
		queue = tmp;
	}

}
