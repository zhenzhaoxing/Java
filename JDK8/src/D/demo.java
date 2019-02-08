package D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class demo {
         public static void main(String[] args) {
			 HashMap<Integer, User> map = new HashMap<>();
			 map.put(1, new User("张三",25));
			 map.put(4, new User("李四",28));
			 map.put(2, new User("王五",18));
			 map.put(3, new User("赵柳",36));
			 System.out.println(map);
			
			 

			HashMap<Integer, User> map2 = sortHashMap(map);
			System.out.println("排序后的map");
			System.out.println(map2);
		}
         
         public static HashMap<Integer, User> sortHashMap(HashMap<Integer, User> map){
			
        	 Set<Entry<Integer, User>> set = map.entrySet();
        	 
        	 List<Entry<Integer, User>>  lists = new ArrayList<>(set);
        	 
        	 Collections.sort(lists, (o1,o2)->o1.getValue().getAge()-o2.getValue().getAge());
        	 
     
        		 
        		 
			
            LinkedHashMap<Integer, User> linklistMap  = new LinkedHashMap<>();
            for (Entry<Integer, User> entry : lists) {
				linklistMap.put(entry.getKey(), entry.getValue());
			}
        	 return linklistMap;
         }
}
