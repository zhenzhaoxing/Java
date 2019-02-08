package shuzu;

import java.util.HashMap;

public class On {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int x = (int) (Math.random() * 10);
			arr[i] = x;
		}

		int max = arr[0];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int j = 0; j < arr.length; j++) {
			if (max < arr[j]) {
				max = arr[j];
			}

			if (map.containsKey(arr[j])) {
				int value = map.get(arr[j]);
				map.put(arr[j], value + 1);
			} else {
				map.put(arr[j], 1);
			}
			System.err.print(arr[j]);

		}
		System.out.println("数组最大值是" + max + "出现了" + map.get(max) + "次");
	}
}
