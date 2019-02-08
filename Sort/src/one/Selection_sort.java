package one;

public class Selection_sort {

	public static void main(String[] args) {

		// 选择排序 首先 第一轮 12 和 45 比较 然后依次执行12和 35相比 共进行 5次循环 和 冒泡 差不多 每次产生一个最小数放前面
		int arr[] = { 12, 45, 35, 89, 10, 2 };
		for (int x = 0; x < arr.length; x++) {// x=1时
			// 每一次排序就选择最小值 放到第一位 然后 从后以为开始继续执行
			// 如 x = 0 y =1 到 y<6 执行 5回
			// x = 1 y= 2 到 y<6 执行 4回。。。。。。。
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[x] > arr[y]) {
					int lemp = arr[x];
					arr[x] = arr[y];
					arr[y] = lemp;
				}
			}

		}

		System.out.println("排序后的数");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
