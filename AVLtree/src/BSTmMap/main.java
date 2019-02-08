package BSTmMap;

import java.util.ArrayList;
import java.util.Collections;

import intfaceMap.FileOperation;

public class main {

	public static void main(String[] args) {
		String filename = "src/a-tale-of-two-cities.txt";
		long start = System.nanoTime();
		AVLTree<String, Integer> map = new AVLTree<>();
		
		ArrayList<String> words = new ArrayList<>();
		FileOperation.readFile(filename, words);
		//Collections.sort(words);
		//BST总计用时为：37.945258661
		//总计用时为：0.396591101
		System.out.println("单词一共有" + words.size());

		for (String word : words) {

			if (map.contains(word)) {
				map.set(word, map.get(word) + 1);
			} else {
				map.add(word, 1);
			}
		}
		System.out.println("不重复的单词为" + map.size());
		System.out.println("pride出现了：" + map.get("is"));
		long endtime = System.nanoTime();
		System.out.println("总计用时为：" + (endtime - start) / 1000000000.0);

		
		System.out.println(map.isTwoTree());
		System.out.println(map.isBalanced());//判断是否为平衡树
		
		
	}
}
