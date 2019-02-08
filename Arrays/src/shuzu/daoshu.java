package shuzu;

import java.util.Stack;

public class daoshu {
	 static int num[]={14,54,98,78,6,3};
	 
	 
      public static void main(String[] args) {
		
    	Stack<Integer>  s = new  Stack<>();
    	  for(int i=0;i<num.length;i++){
    		       s.push(num[i]);
    	  }
    	 
    	  while(!s.isEmpty()){
    		  Integer integer = s.pop();
    		  System.out.println(integer);
    	  }
    	  /*
    	  Stack<Integer>  s = new  Stack<>();
    	  s.push(12);
    	  System.out.println(s.pop());
    	  System.out.println(s.isEmpty());
	*/
	}
}
