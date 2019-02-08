package Day03;

import java.util.Comparator;

import org.junit.Test;

public class TestMethodRef {
          
	
	@Test
	public void test1(){
		Comparator<Integer> com =(x,y)->Integer.compare(x, y);
		
		System.out.println(com.compare(10, 20));
		Comparator<Integer> com2 = Integer::compare;
		System.out.println(com2.compare(20, 20));
		
	}
}
