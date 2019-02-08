package shuzu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class quchong {
            public static void main(String[] args) {
            	int[] str = {5, 6, 6, 6, 8, 8, 7,4};
            	List<Integer> list = new ArrayList<Integer>();
            	
            	
            /*	for (int i = 0; i < str.length; i++) {
					  if(!list.contains(str[i])){
						  list.add(str[i]);
					  }
				}*/
            	for (int i = 0; i < str.length; i++) {
					     list.add(str[i]);
				}
            	
            	HashSet<Integer>  set = new HashSet<>();
            	set.addAll(list);
            	System.out.println("去除重复后的list集合"+set);

			}
}
