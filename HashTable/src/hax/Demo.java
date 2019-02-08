package hax;

import java.util.TreeMap;

public class Demo {
	public static void main(String[] args) {
     String s ="Doing";
     
    /* System.out.println(s.charAt(1));*/
     System.out.println(Demo.firstUniqChar("ancdefghz"));
	/*System.out.println('a'-'b');//ASCII码
	 * 
	 * 
*/	
    Demo d = new Demo();
   
	
	}
	
	
	
	public static int firstUniqChar(String s) {
		
		for(int i=0;i<s.length();i++) {
			/*s.charAt(i)-'a';*/
			System.out.println(s.charAt(i)-'a');
		}
		TreeMap<String, Integer> hashtable= new TreeMap<String, Integer>();
		
		return 0;
	}
}
