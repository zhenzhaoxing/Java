package one;

import java.util.Arrays;

public class merger_sort {

	public static void main(String[] args) {
		int arr[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };// 97以后
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int[] arr) {
		int[] temp = new int[arr.length];// 在排序前，先建好一个长度等于原数组长度的临时数组，避免递归中频繁开辟空间
		sort(arr, 0, arr.length - 1, temp);
		// 最后在给arr
	}

	private static void sort(int[] arr, int left, int right, int[] temp) {
		if (left < right) {

			int mid = (left + right) / 2;
			sort(arr, left, mid, temp);// 左边归并排序，使得左子序列有序
			sort(arr, mid + 1, right, temp);// 右边归并排序，使得右子序列有序
			merge(arr, left, mid, right, temp);// 将两个有序子数组合并操作
		}
	}

	private static void merge(int[] arr, int left, int mid, int right, int[] temp) {

		int i = left;
		int j = mid + 1;
		int t = 0;
		while (i <= mid && j <= right) {

			if (arr[i] <= arr[j]) {
				temp[t++] = arr[i++];

			}

			else {
				temp[t++] = arr[j++];
			}
		}

		while (i <= mid) {
			temp[t++] = arr[i++];
		}
		while (j <= right) {
			temp[t++] = arr[j++];
		}

		t = 0;
		// 将temp中的元素全部拷贝到原数组中
		while (left <= right) {
			arr[left++] = temp[t++];
		}
	}

}
