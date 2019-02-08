package Day04;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import POJO.Employee;

public class TestStreamAPI1 {

	
       List<Employee> emp = Arrays.asList(
			
			new Employee(102, "李四", 59, "6666.66"),
			new Employee(101, "张三", 18, "9999.99"),
			new Employee(103, "王五", 28, "3333.33"),
			new Employee(104, "赵六", 8, "7777.77"),
			new Employee(104, "赵六", 8, "7777.77"),
			new Employee(104, "赵六", 8, "7777.77"),
			new Employee(105, "田七", 38, "5555.55")
			
			);
	
	@Test
	public void test(){
		emp.stream()
		     .map(Employee::getName)
		     .sorted()
		     .forEach(System.out::println);

	
		
		
	    
	
	}
	@Test
	public void test1(){
		emp.stream()
		   
		     .sorted((x,y)->{
		    	 if(x.getAge()==y.getAge()){
		    		 return x.getName().compareTo(y.getName());
		    	 }else{
		    		 return Integer.compare(x.getAge(), y.getAge());
		    	 }
		     })
		     .forEach(System.out::println);
	}
	
	//2. 中间操作
		/*
			映射
			map——接收 Lambda ， 将元素转换成其他形式或提取信息。接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素。
			flatMap——接收一个函数作为参数，将流中的每个值都换成另一个流，然后把所有流连接成一个流
		 */
		@Test
		public void test3(){
			
			List<String> asList = Arrays.asList("aaa","bbb","ccc","ddd","eee");
			asList.stream()
			  .map(String::toUpperCase)
			  .forEach(System.out::println);
		}
	
	
	
}
