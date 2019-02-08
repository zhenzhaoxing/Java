package TimeComplexityOfSet;

import java.util.ArrayList;

import jyBSTSet.BSTsSet;
import jyBSTSet.FileOperation;
import jyBSTSet.Set;
import jylinkList.LinkedListSet;
/*
 * 
 * 一共有多少个单词141489
不重复的有:9944
tree用时:0.378860333

一共有多少个单词141489
不重复的有:9944
链表用时5.515568595
 * 
 * 
 * */
public class test1 {
	
	
	public static double testSet(Set<String> set,String filename){
		long startTime = System.nanoTime();
		     ArrayList<String> words = new ArrayList<>();
		FileOperation.readFile(filename, words);
		System.out.println("一共有多少个单词"+words.size());
		
		for(String word:words){
			set.add(word);
		}
		System.out.println("不重复的有:"+set.getSize());
		
	
		long endTime = System.nanoTime();
		return (endTime - startTime) / 1000000000.0;
		
	}
	
	
	
	
	
	
public static void main(String[] args) {
	
	 String filename = "src/a-tale-of-two-cities.txt";
	BSTsSet<String> ne = new BSTsSet<>();
	double time = testSet(ne, filename);
	System.out.println("tree用时:"+time);
	System.out.println();
	
	
	
	LinkedListSet<String> linkedListS = new LinkedListSet<>();
	double time2 =testSet(linkedListS, filename);
	System.out.println("链表用时"+time2);
}
}
