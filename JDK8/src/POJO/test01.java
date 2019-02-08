package POJO;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class test01 {

	// 麻烦的方法在 com包下 test_02

	List<Employee> emp = Arrays.asList(

			new Employee(14, "wangwu", 40, "菏泽"), new Employee(1, "凉凉", 25, "单元楼"), new Employee(4, "甄兆星", 98, "恒大"),
			new Employee(14, "王建华", 2, "碧桂园"), new Employee(5, "刘德华", 5, "牛逼楼")

	);
        //实现接口的模式 策略设计模式
	public List<Employee> filterEmployee(List<Employee> emp, MyPredicate<Employee> mp) {
		List<Employee> list = new ArrayList<>();
		for (Employee employee : emp) {
			if (mp.test(employee)) {
				list.add(employee);
			}
		}
		return list;

	}

	@Test
	public void test1() {
		/*MyPredicate<Employee> employeeForAge = new FilterEmployeeForAge();*/
		FilterEmployeeForSalary employeeForSalary = new FilterEmployeeForSalary();
		List<Employee> filterEmployee = filterEmployee(emp, employeeForSalary);
		for (Employee employee : filterEmployee) {
			System.out.println(employee);
		}
	}

	
	



	
	//直接实现匿名实现
	@Test
	public void test2(){
		   List<Employee> list= filterEmployee(emp, new MyPredicate<Employee>() {
			
			@Override
			public boolean test(Employee t) {
				return t.getName()=="甄兆星";
			}
		});
		   
		   for (Employee employee : list) {
			System.out.println(employee);
		}
	}
	
	
	
	//  Lambda 表达式
	@Test
	public void test6(){
		List<Employee> list = filterEmployee(emp, (m)-> m.getId()==1);
		list.forEach(System.out::println);
		System.out.println("--------------");
		List<Employee> list2 = filterEmployee(emp, (m)-> m.getAddress()=="恒大");
		list2.forEach(System.out::println);
		
	}
	
	//Stream 流的表达式
	
	
	@Test
	public void test7(){
		emp.stream()
		      .filter((e) -> e.getAge()>=22)
		      .forEach(System.out::println);
		System.out.println("----------");
		
		System.out.println("+++++++++++");
		emp.stream()
		       .map(Employee::getName)
		       .limit(4)
		       .sorted()
		       .forEach(System.out::println);
		       
		       
	}
	
	
	
}
