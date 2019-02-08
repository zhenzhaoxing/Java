package jyBSTSet;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		 System.out.println("Pride and Prejudice");

	        ArrayList<String> words1 = new ArrayList<>();
	        String filename1 = "D:\\a\\pride-and-prejudice.txt";
	        String filename = "src/a-tale-of-two-cities.txt";
	             FileOperation.readFile(filename, words1);
	            System.out.println("Total words: " + words1.size());

	            //调用BSTsSet
	            BSTsSet<String> s1 = new BSTsSet<>();
            for (String word : words1) {
              s1.add(word);
            }
	            System.out.println("Total different words: " + s1.getSize());
	        }

	       
	
}
