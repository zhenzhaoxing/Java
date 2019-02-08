package jylinkList;

import java.util.ArrayList;

import jyBSTSet.FileOperation;

public class main {

	
	
	
  public static void main(String[] args) {
	
	
	ArrayList<String> list = new ArrayList<>();
	
	 String filename = "src/a-tale-of-two-cities.txt";
	FileOperation.readFile(filename, list);
	System.out.println("总计："+list.size());
	
	
	
	
	LinkedListSet<String> arr = new LinkedListSet<>();
	
	
	
	for(String lis:list){
		arr.add(lis);
	}
	System.out.println("不重复的数："+arr.getSize());
	
	
	
	
	
	
	
}
}
