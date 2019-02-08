package Stringlei;

public class dmeo {

	
	
	

	public static void main(String[] args) {
		
		String  s = "aaa";
		String  b ="aaa";
		System.out.println("aaa".equals(b));
		
		System.out.println("aaa".length());
		System.out.println("SUN"+s.substring(1)+s.charAt(0));
		dmeo d = new dmeo();
		dmeo d1 = new dmeo();
		System.out.println(d==d1);//比较的是地址

		
		int t =2, t1=2;
		System.out.println(t==t1);
				
		
		System.out.println("-----");
		String a = new String("AA");
		String bb = new String("AA");
		System.out.println(a==bb);
		//比较的是对象的内容
		//字符串一般用equal
		System.out.println(a.equals(bb));
		System.out.println();
		System.out.println(d.f("abcde"));
		
	}
 	
	public String  f(String s){
		
		if(s.length()<=1) return s;
		
		return f(s.substring(1))+s.charAt(0);
	}
	
	
}
