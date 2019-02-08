package BSTmMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import intfaceMap.FileOperation;


public class Test {
	public static void main(String[] args) {
		long start = System.nanoTime();

		TreeMap<String, Integer> map = new TreeMap<>();
		String filename = "src/a-tale-of-two-cities.txt";
		ArrayList<String> words = new ArrayList<>();
		FileOperation.readFile(filename, words);
		for (String string : words) {
			if (map.containsKey(string)) {
				map.put(string, map.get(string) + 1);
			} else {
				map.put(string, 1);
			}
		}

		
	
		System.out.println("-------------");
		
		System.out.println("不重复的单词为" + map.size());
		System.out.println("pride出现了：" + map.get("is"));
		long endtime = System.nanoTime();
		System.out.println("总计用时为：" + (endtime - start) / 1000000000.0);
              System.out.println();
		
              Set<Entry<String, Integer>> set = map.entrySet();
            // System.out.println(map.entrySet());
              //[a=3017, aback=1, abandon=1, abandoned=10, abandoning=1, abandonment=1, abashed=1, abate=1,]
              System.out.println();
         /*
		 * Set<Entry<String, Integer>> entrySet = map.entrySet();
		 * for(Map.Entry<String, Integer> m:map.entrySet()){
		 * 
		 * //System.out.println(m.getKey()+"--"+m.getValue()); }
		 */
		// 遍历只是取 前10个内容
		Set<String> keySet = map.keySet();
	
		System.out.println(keySet+"ss");
		Iterator<String> iterator = keySet.iterator();
		for (int k = 1; iterator.hasNext(); k++) {
			if (k < 10) {
				System.out.println(iterator.next() + "---" + map.get(iterator.next()));
			} else {
				break;
			}
		}
		System.out.println();
		
		// 排序 转为 list 比较值
		List<Map.Entry<String, Integer>> arrlist = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		// 比较
		Collections.sort(arrlist, new Comparator<Map.Entry<String, Integer>>() {
			
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return ((Integer) o2.getValue()).compareTo((Integer) o1.getValue());
			}
		});
		// 创建新的集合来装元素
		List<Entry<String, Integer>> list = arrlist.subList(0, 10);
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry);
		}
	
	}
	}

