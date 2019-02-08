package one;
/**
 * 两个栈实现队列
 * @author xiang
 * 1 要出的栈必须一次性倒满
 * 2 出的栈中有数据就不能倒了
 * 
 */

import java.util.Stack;

public class TwoStackTo_queue {
	// 只负责压栈
	private Stack<Integer> stackPush = new Stack<>();

	// 负责出栈
	private Stack<Integer> stackPop = new Stack<>();

	public void push(int pushInt) {
		stackPush.push(pushInt);
	}

	// 出队
	public int poll() {
		if (stackPop.empty() && stackPush.empty()) {
			throw new RuntimeException("Queue is empty!");
		} else if (stackPop.isEmpty()) {
			//要出的栈不为空才能到
			while (!stackPush.isEmpty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();

	}

	public int peek() {
		if (stackPop.empty() && stackPush.empty()) {
			throw new RuntimeException("Queue is empty!");
		} else if (stackPop.isEmpty()) {
			while (!stackPush.isEmpty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.peek();

	}

}
