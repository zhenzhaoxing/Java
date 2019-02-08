package one;
/**
 * 堆排序 堆数据结构
 * @author xiang
 * 是一颗顺序存储的完全2叉树
 * 其中每个结点的关键字都大于其孩子结点的关键字，这样的堆称为大根堆。

         其中每个结点的关键字都小于其孩子结点的关键字，这样的堆称为小根堆
         
    堆排序  每次最大的数都是在第一个数 保证第一个和后面交换就可以了 每次交换后都维护一下
 */
public class Heap_sort {
  
	public static void heapsrot(int[] arr){
		if(arr==null||arr.length<2){
			return;
		}
		/*for (int i : arr) {
			System.out.print(i);
		}
		System.out.println();*/
		for (int i = 0; i < arr.length; i++) {
			heapInsert(arr, i);
		}
		/*for (int i : arr) {
		System.out.print(i);
	}*/

		//堆排序 就是让 0位置得数 和 size 交换 
		int size = arr.length;
		//swap(arr, 0, --size);
		while(size>0){
			heapify(arr, 0, size);
			swap(arr, 0, --size);
		}
		
		for (int i : arr) {
			System.out.print(i);
		}
	
	}
	//建立堆 这是大根堆 每个节点的父节点值都比其孩子大   维护 大于就交换
	public static void heapInsert(int[] arr,int index){
		//当前节点和 父节点进行比较 大于就交换 然后 index下标指向 父节点
		while(arr[index]>arr[(index-1)/2]){
			swap(arr, index, (index-1)/2);
			index= (index-1)/2;
			//然后再继续比较   用当前节点和 其父节点继续 比较
		}
		
	}
	
	
	
	/**
	 * 堆里面当有 某个父节点 变化时 那么就必须调整结构
	 * @param arr
	 * @param index
	 * @param size  0 5
	 */
	public static void heapify(int[] arr, int index, int size) {
		int left = index * 2 + 1;
		while (left < size) {
			int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
			largest = arr[largest] > arr[index] ? largest : index;
			if (largest == index) {// 当其下面两孩子其中一个等于 index 时 那么就没必要相比了 直接·跳出
				break;
			}
			swap(arr, largest, index);// 不相等时 一个数4  ，左 为3  ， 右为5   4 跟5 也就是 下边0 和2交换
			//继续判断该节点是否满足条件
			index = largest;
			left = index * 2 + 1;
		}
	}
	
	
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void main(String[] args) {
		int arr[]= {2,0,3,1,5,6,9,2};
		heapsrot(arr);
		
	}
}
