package BSTmMap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class listDemo {
       public static void main(String[] args) throws IOException {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 50; i++) {
			list.add(i);
		}
		List<Integer> list2 = list.subList(0, 10);
		 for (Integer integer : list2) {
			 System.out.println(integer);
		}
		BufferedReader  readfile = new BufferedReader(new FileReader("src/a-tale-of-two-cities2.txt")) ;
		    String line = readfile.readLine();
		  System.out.println(line);
		  String con =readfile.readLine();
		  String str= readfile.readLine();
		
		
		     String[] split = str.split(" ");
		   ArrayList<String> s = new ArrayList<>();
		     for (String string : split) {
			  s.add(string);
		}
		  System.out.println(s);
		/*  while(true){
			
			str= readfile.readLine();
			if(str!=null)
				//System.out.println(str);
			else
				break;
		  }*/
		 
	}
}
