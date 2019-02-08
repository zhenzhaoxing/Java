package read;


import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.util.LinkedList;



public class Test {
       public static void main(String[] args) throws Exception {
		     LinkedList<String> list =  new LinkedList<>();
    	   
		     
		     BufferedReader  red = new  BufferedReader(new FileReader("src/a-tale-of-two-cities2.txt"));
		       String line = null;
    	
    	     while(true){
    	    	 line= red.readLine();
    				if(line!=null){
    					//System.out.println(line);
    				  String[] split = line.split(" ");
    				     for (String string : split) {
							  list.add(string);
						}  
    				}
    				else{
    					break;
    			  }
    	     
    	   
    	     }
    	     //  把读取出来的值添加到 list里面
    	     System.out.println(list);
    	     
       }
       
}
