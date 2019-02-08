package one;

/**
 * 用数组实现栈
 * 
 * @author xiang
 *
 */
public class Array_To_Stack {
	private Integer[] arr;
	private Integer index;
    
	public Array_To_Stack(int initSize) {
		if (initSize < 0) {
			throw new IllegalArgumentException("The init size is less than 0");
		}
		arr = new Integer[initSize];
		index = 0;

	}

	// 加入栈
	public void push(int value) {

		if (index == arr.length) {
			throw new ArrayIndexOutOfBoundsException("The queue is full");
		}
		//加入数据后 然后 index只增  加满后就是 index==arr.lenght
		arr[index++] = value;

	}

	// 弹出栈

	public Integer pop() {
		if (index == 0) {
			throw new ArrayIndexOutOfBoundsException("The queue is empty");
		}

		return arr[--index];

	}

	public static void main(String[] args) {
		Array_To_Stack a = new Array_To_Stack(3);
		a.push(0);
		a.push(20);
		a.push(30);
		System.out.println(a.pop());
	}
}
