package Stringlei;

public class Test0 extends Dog {
	
	public Test0(){
		super();
		System.out.println("无参构造");
		
	}
	
	
	public Test0(String name){
		
		System.out.println(name);
	}
      public void set(String name){
		super.set();
		System.out.println(name);
	}
      
      public void set(){
  		System.out.println("d");
  	}
public static void main(String[] args) {
	//StringBuilder sb = new StringBuilder("zhen"); //��ʼ��Ϊ16
	//sb.append("zhao").append("xing");//return thisʵ�ַ�����
	//System.out.println(sb);
	
	
	Test0 t = new Test0();
	
	t.set("ddd");
	
}
}
