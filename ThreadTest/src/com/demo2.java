package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * 创建一个单线程的线程池。这个线程池只有一个线程在工作，也就是相当于单线程串行执行所有任务。如果这个唯一的线程因为异常结束，
 * 那么会有一个新的线程来替代它。此线程池保证所有任务的执行顺序按照任务的提交顺序执行。
 * */
public class demo2 {
	public static void main(String[] args) {
      ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
      singleThreadExecutor.execute(new MyThread1());
      singleThreadExecutor.execute(new MyThread1());
      singleThreadExecutor.execute(new MyThread1());
      singleThreadExecutor.execute(new MyThread1());
      singleThreadExecutor.shutdown();
	}
}


class MyThread1 implements Runnable{
  int sum=30;
	@Override
	public void run() {
		while(sum>0) {
		System.out.println(Thread.currentThread().getName()+"正在执行"+sum--);
		}
	}
	
}