package one;

import java.util.Arrays;

public class Insertion_sort {
	/*
	 * 基本思想 把数组下标为零的设置定数 后面的从1开始都与他比较 设置个额外变量 temp j = x-1; x的左边 和temp比较 总条件是
	 * j》=0 && arr[j]>temp 满足 继续下去把 arr【j】 赋值给 arr[j+1] 然后j-- 在于temp相比 。。。 当
	 * j--后arr[j]<temp 把temp赋值 给 j+1
	 */
	public static void main(String[] args) {
		int arr[] = { 87, 18, 69, 64, 56, 96, 9 };
		//int[] par = par(arr);
		//System.out.println(Arrays.toString(par));

		int[] is = zuopai(arr);
		System.out.println(Arrays.toString(is));

	}

	public static int[] zuopai(int[] num) {
		// 87,18,69,64,56,96
		if (num == null && num.length < 2) {return null;}
		for (int i = 1; i < num.length; i++) {
			for (int j = i - 1; j >= 0 && num[j] > num[j + 1]; j--) {
				swap(num, j, j + 1);
			}
		}
		return num;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int[] par(int[] arr) {

		for (int x = 1; x < arr.length; x++) {
			int temp = arr[x];
			int j = x - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];// 大于就后移动 空出位置来
				j--;
			}
			// 当上面条件不满足时 就会执行这一句
			arr[j + 1] = temp;

		}
		return arr;

	}

}