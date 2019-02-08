package one;

/**
 * 荷兰国旗问题 给定一个数组 和 一个数num 要求把小于num的放左边， 大于num的放右边 等于 num的放中间
 * 
 * @author xiang
 *
 */
public class Helan {

	public static int[] pint(int[] arr, int left, int right, int num) {
		int less = left - 1;// 存放的是小于num的区域
		int more = right + 1;// 存放的是大于num的区域

		int cur = left;
		while (cur < more) {// 条件是在 cur《 more区域内进行
			if (arr[cur] < num) {
				// 遇到小于的数 先把 小于区域扩大1个 然后把 cur所指当前的数加入 cur 在指向下一个数 继续比较
				swap(arr, ++less, cur++);
			} else if (arr[cur] > num) {
				//遇到大的数 把当前的数 和 more下一数进行交换 但是 cur不动 因为 在 cun到more区是待定区域 并不知道数的大小
				swap(arr, --more, cur);
			} else {
				// 说明等于num那么cur就做++
				cur++;
			}

		}

		return arr;

	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void main(String[] args) {
		int num = 5;
		int arr[] = { 1, 8, 5, 3, 7, 1, 9, 5, 1 };

		int[] pint = pint(arr, 0, arr.length - 1, num);
		for (int i : pint) {
			System.out.println(i);
		}
	}
}
