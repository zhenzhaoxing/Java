package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import POJO.Employee;

public class test_02 {
	public static void main(String[] args) {
		/*Arrays.asList("ss", "g", "j", "w");
		System.out.println(Arrays.asList("ss", "g", "j", "w"));
                         */
		// 年龄大于35的员工信息

		List<Employee> emp = Arrays.asList(

				new Employee(14, "wangwu", 40, "菏泽"), new Employee(1, "凉凉", 25, "单元楼"),
				new Employee(4, "甄兆星", 98, "恒大"), new Employee(14, "王建华", 2, "碧桂园"), new Employee(5, "刘德华", 5, "牛逼楼")

		);
		//最麻烦的写法
		System.out.print(jdk7(emp));
		System.out.println(jdk71(emp));
		//接口实现类
		
	}
         //以前这样写
	public static ArrayList<Employee> jdk7(List<Employee> emp) {
		ArrayList<Employee> list = new ArrayList<>();
		for (Employee employee : emp) {
			if (employee.getAge() > 35) {
				list.add(employee);
			}
		}
		return list;
	     }
            //获取 getid ==1的用户
	public static ArrayList<Employee> jdk71(List<Employee> emp) {
		ArrayList<Employee> list = new ArrayList<>();
		for (Employee employee : emp) {
			if (employee.getId()==1) {
				list.add(employee);
			}
		}
		return list;
	     }

	
	
	
	
	
	
	
}
