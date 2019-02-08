package HASH;

import java.util.ArrayList;



public class main {
public static void main(String[] args) {
	 String filename = "src/a-tale-of-two-cities.txt";
	 
	long start = System.nanoTime();
	 
	 
	   HashTable<String, Integer> hash = new HashTable<>();
		ArrayList<String> words= new ArrayList<>();
		FileOperation.readFile(filename, words);
		System.out.println("单词总数:"+words.size());
		
		
		
		for (String word : words) {
		        if(hash.contain(word)){
		        	hash.add(word, hash.get(word)+1);
		        }else{
		        	hash.add(word, 1);
		        }
		}
		System.out.println(hash.getSize());
		System.out.println("pride出现了："+ hash.get("is"));
		long end = System.nanoTime();
		System.out.println((end-start)/1000000000.0);
		
}
}
