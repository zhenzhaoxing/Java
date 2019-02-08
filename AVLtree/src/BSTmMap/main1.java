package BSTmMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

import intfaceMap.FileOperation;

public class main1 {
   private static double testMa(AVLTree<String, Integer> map,String filename) {
	  
		long start1 = System.nanoTime();
		ArrayList<String> words = new ArrayList<>();
		
		FileOperation.readFile(filename, words);
		Collections.sort(words);
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
		long endtime1=System.nanoTime();
		
	   return (endtime1 - start1) / 1000000000.0;
	   
   }
public static void main(String[] args) {
	String filename = "src/a-tale-of-two-cities.txt";
	
	
	BST<String, Integer> bet= new BST<>();
//	 double d = testMa(bet, filename);
//     System.out.println(d);//0.26  排序后是37
	
	AVLTree<String, Integer> map = new AVLTree<>();
	double testMa = testMa(map, filename);
	System.out.println(testMa);//0.27 排序后是0.32
	}
}

