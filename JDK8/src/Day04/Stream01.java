package Day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

import POJO.Employee;

public class Stream01 {
    
	
	@Test   
	public void test1(){
	List<String> list = new ArrayList<>();
	Stream<String> stream = list.stream();//获取顺序流
	Stream<String> stream78 = list.parallelStream();//获取一个并行流
	

	//2. 通过 Arrays 中的 stream() 获取一个数组流
	Integer[] num = new Integer[10];
	 Stream<Integer> stream3 = Arrays.stream(num);
	
	
	
	//3. 通过 Stream 类中静态方法 of()
			Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6);
			
			//4. 创建无限流
			//迭代
			Stream<Integer> stream31 = Stream.iterate(0, (x) -> x + 2).limit(10);
			stream31.forEach(System.out::println);
			
			//生成
			Stream<Double> stream4 = Stream.generate(Math::random).limit(2);
			stream4.forEach(System.out::println);
	
	}
	
	
	
	
	
	
	
	List<Employee> emp = Arrays.asList(
			
			new Employee(102, "李四", 59, "6666.66"),
			new Employee(101, "张三", 18, "9999.99"),
			new Employee(103, "王五", 28, "3333.33"),
			new Employee(104, "赵六", 8, "7777.77"),
			new Employee(104, "赵六", 8, "7777.77"),
			new Employee(104, "赵六", 8, "7777.77"),
			new Employee(105, "田七", 38, "5555.55")
			
			);
	/*
	  筛选与切片
		filter——接收 Lambda ， 从流中排除某些元素。
		limit——截断流，使其元素不超过给定数量。
		skip(n) —— 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
		distinct——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
	 */
	@Test
	public void test2(){
		         emp.stream()
				 .filter((e) ->{
					
					return e.getAge()>8;})
				 .limit(2)
				 //.skip(2) 跳过前两个
				 .forEach(System.out::println);
	}

	@Test
	public void test3(){
		         emp.stream()
					
				 .distinct()
				 //.skip(2) 跳过前两个
				 .forEach(System.out::println);
	}
}
