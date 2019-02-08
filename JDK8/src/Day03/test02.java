package Day03;

import java.util.function.Function;

import org.junit.Test;

import POJO.Employee;

public class test02 {
	//数组引用
		@Test
		public void test8(){
			Function<Integer, String[]> fun = (args) -> new String[args];
			String[] strs = fun.apply(10);
			System.out.println(strs.length);
			
			System.out.println("--------------------------");
			
			Function<Integer, Employee[]> fun2 = Employee[] :: new;
			Employee[] emps = fun2.apply(20);
			System.out.println(emps.length);
		}
}
