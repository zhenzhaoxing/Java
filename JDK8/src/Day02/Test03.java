package Day02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import POJO.Employee;

public class Test03 {

	List<Employee> emp = Arrays.asList(

			new Employee(14, "wangwu", 40, "菏泽"), new Employee(1, "凉凉", 25, "单元楼"), new Employee(4, "甄兆星", 98, "恒大"),
			new Employee(14, "王建华", 2, "碧桂园"), new Employee(5, "刘德华", 5, "牛逼楼")

	);

	@Test
	public void test2() {
		Collections.sort(emp, (e1, e2) -> {
			if (e1.getAge() == e2.getAge()) {
				return e1.getName().compareTo(e2.getName());
			} else {
				return Integer.compare(e1.getAge(), e2.getAge());
			}

		});
		for (Employee employee : emp) {
			System.out.println(employee);
		}

	}

	@Test
	public void test1() {
		MyStr st = new MyStr() {

			@Override
			public String getValue(String str) {
				return str.toUpperCase();
			}
		};

		MyStr n = (x) -> x.toUpperCase().substring(2, 4);
		System.out.println(n.getValue("abcdefgh"));

		System.out.println(st.getValue("aaaaaaaa"));

	}

	@Test
	public void test3() {

		Mylong<Long, Long> n = (x, y) -> x + y;

		System.out.println(n.getvalue(10L, 20L));
		// --------------------------------------------------------------
		op(500L, 1000L, (j, x) -> j - x);

	}

	public void op(Long l1, Long l2, Mylong<Long, Long> my) {
		System.out.println(my.getvalue(l1, l2));
	}

}
