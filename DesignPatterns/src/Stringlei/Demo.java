package Stringlei;

import java.net.StandardSocketOptions;
import java.util.ArrayList;

public class Demo {

	 
	
	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo();
		System.out.println("--"+d.equals(d1));
		String s ="Ssdd".concat("heze");
		//���������ֵ�����
		int of = s.lastIndexOf("d");
		System.out.println(d.toString());
		System.out.println(s+of);
		//��Сдת��
		String n ="abcdefg";
		String case1 = n.toUpperCase();
		System.out.println(case1);
		//�����Ƿ���a��ͷ
		boolean b = n.startsWith("a");
		System.out.println(b);
		//����һ���ַ��������ַ����Ǵ��ַ��������ַ����� ��3��ʼ������
		int index =2;
		String substring = n.substring(index+1);
		System.out.println(substring);
		//�ж������Ƿ����
		String str = new String("abcd");
		String str2 = new String("abcd");
		System.out.println(str2.equals(str));   //�Ƚ������Ƿ���ȡ�
		System.out.println(str2==str+"----"+str2+str);
        System.out.println("---");    
		String str3 = "def";
		String str4 = "def";
		System.out.println(str3.equals(str4));
		System.out.println(str3==str4);

		System.out.println(str3.indexOf('y')); 
		System.out.println("-------");
		
		//תСд
		System.out.println("Abcbd".toLowerCase());
	System.out.println("ABC".equalsIgnoreCase("abc"));
	System.out.println("Abcbd".indexOf('b')); 
	System.out.println("Abcbd".endsWith("bd")); 
	
	
	
	String str6 = "abcde,rrtt,cccee";
	String[] strArray = str6.split(",");
	for(int i=0;i<strArray.length;i++){
		System.out.println(strArray[i]);
	}
	//ɾ��ǰ��β��Ŀո�
	String str7 = "  aa  bb  ";
	String str77 = str7.trim();
	System.out.println(str77); 
	
	String br ="heze";
	br.valueOf("c");
	System.out.println(String.valueOf("shansong"));
	
	}
}
