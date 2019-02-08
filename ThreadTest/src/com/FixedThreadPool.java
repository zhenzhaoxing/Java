package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * 创建固定大小的线程池。每次提交一个任务就创建一个线程，直到线程达到线程池的最大大小。//创建后2者平摊执行任务
 * 线程池的大小一旦达到最大值就会保持不变，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程。
 * */
public class FixedThreadPool {
public static void main(String[] args) {
	ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
	fixedThreadPool.execute(new MyThread2());
	fixedThreadPool.execute(new MyThread2());
	fixedThreadPool.execute(new MyThread2());
	fixedThreadPool.execute(new MyThread2());
	fixedThreadPool.shutdown();
}
}



class MyThread2 implements Runnable{
	  int sum=30;
		@Override
		public void run() {
			while(sum>0) {
			System.out.println(Thread.currentThread().getName()+"正在执行"+sum--);
			}
		}
		
	}