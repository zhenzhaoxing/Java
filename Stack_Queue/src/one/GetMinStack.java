package one;
//定义一个栈 并且包含 得到最小值得栈

import java.util.Stack;



public class GetMinStack {

	private Stack<Integer> stackData;
	// 这个是 包含最小值得栈 仅仅 只出最小值 其他 法都在 stackData里面
	private Stack<Integer> stackMin;

	public GetMinStack() {
		this.stackData = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
	}

	// 压进栈
	public void push(int newNum) {
		if (this.stackMin.isEmpty()) {
			stackMin.push(newNum);
		} else if (newNum > this.stackMin.peek()) {
			int min = stackMin.peek();
			stackMin.push(min);
		} else {
			this.stackMin.push(newNum);
		}
		this.stackData.push(newNum);

	}

	// 弹出
	public Integer pop() {
		if (this.stackData.isEmpty()) {
			throw new RuntimeException("the stack is empty");
		}
		this.stackMin.pop();
		return this.stackData.pop();

	}

	// 获取最小值
	public int getmin() {
		if (this.stackMin.isEmpty()) {
			throw new RuntimeException("the stack is empty");
		}
		return this.stackMin.peek();
	}

	public static void main(String[] args) {
		GetMinStack g = new GetMinStack();
		g.push(15);
		g.push(5);
		g.push(10);
		g.push(30);
		g.push(40);
		g.push(70);
		g.push(90);
		g.push(200);
		g.push(1784);
		g.push(2000);
		int getmin = g.getmin();
		System.out.println(getmin);
 Stack<Integer> s = new Stack<>();
      
	}
}
