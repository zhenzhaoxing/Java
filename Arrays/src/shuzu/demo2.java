package shuzu;

import java.util.Scanner;

public class demo2 {
       
	public static void main(String[] args) {
		double sum =0;
		double[] arr = new double[8];
		
		Scanner sc = new Scanner(System.in);//输出
		
		for(int x=0 ; x<arr.length;x++){
			System.out.println((x+1));
			arr[x] = sc.nextDouble();
			sum+=arr[x];
			
		}
		
		double sug = sum/arr.length;
		System.out.println(sug);
		double max = arr[0];
		
		for(int x=0;x<arr.length;x++){
			if(max<arr[x]){
				max=arr[x];
			}
		}

		System.out.println(max);
		
	}

}
