package Concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		Map<String, Integer> synchronizedMap = Collections.synchronizedMap(map);//加锁后的map
	  
	}
}
