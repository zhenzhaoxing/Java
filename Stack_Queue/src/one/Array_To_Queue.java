package one;
/**
 * 数组转为队列
 * @author xiang
 * 先进先出
 */
public class Array_To_Queue {
        private Integer[] arr ;
        private int end;
        private int first;
        private int size;
	
	
	public Array_To_Queue(int init){
		if (init < 0) {
			throw new IllegalArgumentException("The init size is less than 0");
		}
		arr= new Integer[init];
		end=0;
		first=0;
		//数组个数
		size=0;
	}
	
	
	//入队
	public void push(int value){
		if(size==arr.length){
			throw new ArrayIndexOutOfBoundsException("The queue is full");
		}
		size++;
		arr[end]=value;//没加个数 都是 往下走一个数
		end=end==arr.length-1?0:end+1;
	}
	//出队
	public Integer poll(){
		if(size==0){
			throw new ArrayIndexOutOfBoundsException("The queue is empty");
		}
		size--;
		int tmp=first;//给个中间变量
		first=first==arr.length-1?0:first+1;
		
		return arr[tmp];
		
	}
	public static void main(String[] args) {
		Array_To_Queue a = new Array_To_Queue(3);
	     a.push(10);
	     a.push(20);
	     a.push(30);
	     
		System.out.println(a.poll());
		
		
		
	}
}
