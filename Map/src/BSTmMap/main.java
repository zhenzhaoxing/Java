package BSTmMap;

import java.util.ArrayList;
import java.util.Map;

import intfaceMap.FileOperation;
import linklistMap.LinkListMap;

public class main {

	public static void main(String[] args) {
		long start= System.nanoTime();
		BSTMAP<String,Integer> map = new BSTMAP<>();
		 String filename = "src/a-tale-of-two-cities.txt";
			ArrayList<String> words= new ArrayList<>();
			FileOperation.readFile(filename, words);
			System.out.println("单词一共有"+words.size());
			
	

			for(String word:words){
				
			if(map.contain(word)){
				map.set(word, map.get(word) + 1);
			}
			else{
				map.add(word, 1);
			}
			}
			System.out.println("不重复的单词为"+map.getSize());
			System.out.println("is出现了："+ map.get("is"));
         	long endtime = System.nanoTime();	
	System.out.println("总计用时为："+(endtime-start)/1000000000.0);
	          for (int i = 0; i < 10; i++) {
				
			}
	                      
	
	
	}
		
		
		

	

}
