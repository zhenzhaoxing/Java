package com;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class demo {
public static void main(String[] args) {
	ThreadPoolExecutor d = new ThreadPoolExecutor(1, 2, 3, TimeUnit.SECONDS, new LinkedBlockingDeque<>(3));
	d.execute(new MyThread());
	d.execute(new MyThread());
	d.execute(new MyThread());
	d.execute(new MyThread());
	d.execute(new MyThread());
	d.shutdown();
}
}
class MyThread implements Runnable{
    int sum=50;
	@Override
	public void run() {
		while(sum>0)
			try {
				Thread.sleep(100);
				System.out.println(Thread.currentThread().getName()+sum--);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
}