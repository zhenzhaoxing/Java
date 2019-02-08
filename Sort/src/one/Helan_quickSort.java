package one;

/**
 * 基于荷兰国旗问题的快排 经典快排是 每次只能得出一个数 但是还有可能会有相同的数 改进的快排是可以得到所有x的数
 * 
 * @author xiang
 *
 */
public class Helan_quickSort {
	// 0 arr.lenght-1
	public static void quickSort(int arr[], int L, int R) {
		if (L < R) {
			int[] p = partition(arr, L, R);
			quickSort(arr, L, p[0] - 1);
			quickSort(arr, p[1], R);

		}

	}

	public static int[] partition(int[] arr, int L, int R) {
		int less = L - 1;//数组左边开个空间
		int more = R + 1;//右边开空间
		int cur = L;
		while (cur < more) {
			if (arr[cur] < arr[R]) {
				swap(arr, ++less, cur++);
			} else if (arr[cur] > arr[R]) {
				swap(arr, --more, cur);//与大于左边的数交换后 继续比较 因 这是在待定区域取得数
			} else {
				cur++;
			}
		}
		// R 是 需要的x
		swap(arr, more, R);
		return new int[] { less + 1, more };
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
