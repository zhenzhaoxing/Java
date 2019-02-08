package linklistMap;


import java.util.ArrayList;

import intfaceMap.FileOperation;



public class main {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime();
		 String filename = "src/a-tale-of-two-cities.txt";
		ArrayList<String> words= new ArrayList<>();
		FileOperation.readFile(filename, words);
		System.out.println(words.size());
		
		LinkListMap<String,Integer>  map = new LinkListMap<>();

		for(String word:words){
			
		if(map.contain(word)){
			
			map.set(word, map.get(word) + 1);
		}
		else{
			map.add(word, 1);
		}
		}
		System.out.println(map.getSize());
		System.out.println("pride出现了："+ map.get("is"));

	long endtime = System.nanoTime();
	System.out.println("用时为："+(endtime-startTime)/1000000000.0);
	}

}
