package shuzu;

public class Max {
	public static void main(String[] args) {
		int[] num = { 10, 58, 38, 99, 30, 100 };
		int max = max(num);
		System.out.println(max);
	}

	public static int max(int[] num) {

		int maxind = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > maxind) {
				maxind = num[i];
			}
		}
		return maxind;

	}

	// 递归解法
	// 0 5
	public static int qiuMax(int[] num, int l, int r) {
		// int[] num = { 10, 58, 38, 99, 30, 100 };
		if (l == r) {
			return num[l];
		}
		int mix = (l + r) / 2;
		// 求左边最大值
		int left = qiuMax(num, l, mix);

		// 求右边最大值
		int right = qiuMax(num, mix + 1, r);

		return Math.max(left, right);

	}

}
