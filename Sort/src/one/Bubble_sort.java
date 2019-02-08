package one;
/**
 * 时间复杂度 大O n的平方
 * @author xiang
  * 进行 数组长度-1轮次
 */
public class Bubble_sort {

	public static void main(String[] args) {

		int arr[] = { 78, 45, 30, 2, 6, 3 };

		for (int i = 1; i < arr.length; i++) {

			for (int j = 0; j < arr.length - i; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
		for (int x : arr) {
			System.out.println(x);
		}

	}

}
