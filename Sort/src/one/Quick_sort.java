package one;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Quick_sort {
	static int arr[] = { 6, 1, 2, 7, 9, 3, 4, 5, 8, 10 };
	public static void main(String[] args) {
		
		Quick_sort.pasort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	// 方法是 通过递归调用
	/*
	 * 6 为基本点 j在最右边开始 找比6小的 i从开始6开始 找到比六大的 都找到 这2个数就交换 然后再找 直到i=j 然后 让6 和这个 i交换
	 * 这样就 6 的左边 比六小 右边比六大 基本点 6 就移动到 中间了
	 * 
	 * j 向左移 在遇到 数大与6时就停下
	 * 
	 * 
	 */

	public static void pasort(int arr[], int left, int right) {
		   // 当左边大与右边就结束
		if (left >=right) {
			return;
		}
		   // 把最左边的值设为基本点
		    int p = arr[left],i=left,j=right;
		
		    while (i < j) {// 左边小于右边
		    // j向左移 ，找到比基本点 小就停下
			while (arr[j] >= p && i < j) {
				j--;// 遇到比p小的就退出
			}
			// i向右移 ，找到一个比基本点大的就停下
			while (arr[i] <= p && i < j) {
				i++; // 遇到比p基本点大的就退出
			}
			if (i < j) {
				swap(i, j);
			}
		}
		// 把这个i 给最左边
		arr[left] = arr[i];
		// 基本点 最 i 移到中间了
		arr[i] = p;
		// 递归调用
		pasort(arr, left, i - 1);
		pasort(arr, i + 1, right);
	}
	
	   public static void swap(int i,int j){
		    int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
	   
	   }	   
}