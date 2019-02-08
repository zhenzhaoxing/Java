package Day03;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;
import org.junit.experimental.theories.FromDataPoints;
import org.omg.Messaging.SyncScopeHelper;

/*
 * Java8 内置的四大核心函数式接口
 * 
 * Consumer<T> : 消费型接口
 * 		void accept(T t);
 * 
 * Supplier<T> : 供给型接口
 * 		T get(); 
 * 
 * Function<T, R> : 函数型接口
 * 		R apply(T t);
 * 
 * Predicate<T> : 断言型接口
 * 		boolean test(T t);
 * 
 */
public class test01 {

	/*
	 * Supplier<T> : 供给型接口 T get();
	 */
	@Test
	public void test5() {
		List<Integer> list = fall(10, () -> (int) (Math.random() * 100));
		for (Integer integer : list) {
			System.out.println(integer);
		}
		Supplier s = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return 10;
			}
		};
		System.out.println(s.get());
	}

	public List<Integer> fall(int num, Supplier<Integer> f) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			Integer n = f.get();
			list.add(n);
		}
		return list;

	}

	/*
	 * Consumer<T> : 消费型接口 void accept(T t);
	 */

	@Test
	public void tes() {

		te("hahahha", (x) -> System.out.println(x));

	}

	public void te(String str, Consumer<String> s) {
		s.accept(str);
	}

	/*
	 * Function<T, R> : 函数型接口 R apply(T t);
	 */

	@Test
	public void test2() {
		String str = handStr("山东菏泽", (x) -> x.substring(0, 2));

		String str2 = handStr("abcdefg", (n) -> n.toUpperCase());
		System.out.println(str + str2);
	}

	public String handStr(String str, Function<String, String> fu) {
		return fu.apply(str);
	}

	/*
	 * Predicate<T> : 断言型接口 boolean test(T t);
	 * 
	 */

	@Test
	public void test1() {
		List<String> list = Arrays.asList("hello", "atguigu", "Lambda", "www");
		List<String> list2 = filterStr(list, (s) -> s.length() > 3);
		for (String string : list2) {
			System.out.println(string);
		}

		
		
		
		
		
		Predicate<String> pr = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() > 3;
			 }
	        	};
		
		
		List<String> str = filterStr(list2, pr);
		System.out.println(str);

	}

	
	
	
	public List<String> filterStr(List<String> list, Predicate<String> pre) {
		ArrayList<String> strlist = new ArrayList<>();
		for (String string : list) {
			if (pre.test(string)) {
				strlist.add(string);
			}

		}
		return strlist;
	}

}
