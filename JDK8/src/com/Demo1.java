package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
         public static void main(String[] args) {
			
        	 
        	 
        	 String[] ar = {"alibaba","google","facebook","Baidu","Sina"};
        	 List<String> name1 = new ArrayList<>();
        	       for (int i = 0; i <ar.length; i++) {
					name1.add(ar[i]);
				}
        	 
        	 
        	       
        	 List<String> name2 = new ArrayList<>();
        	          for (int i = 0; i < ar.length; i++) {
						name2.add(ar[i]);
					}
        	       
        	          
        	          Demo1 te = new Demo1();
        	          System.out.println("使用java7");
        	          te.sortUsingJDK7(name1);
        	          System.out.println(name1);
        	          
        	          System.out.println("使用java8");
        	          te.sortUsingJDK8(name2);
        	          System.out.println(name2);
		}
         
         
         
         
         
         void sortUsingJDK7(List<String> name){
        	       Collections.sort(name, new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						return o1.compareTo(o2);
					}
        	       });
         }
         
         
         void sortUsingJDK8(List<String> name){
                        Collections.sort(name, (s1,s2)->s1.compareTo(s2));
        	 
        	 
        	 
        	 
         }
}
