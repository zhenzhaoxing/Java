package shxi;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demozh {
	private Lock lock = new ReentrantLock();
	// 生产者
	private Condition producer = lock.newCondition();
	private Condition consumer = lock.newCondition();
	int Conyy;

	public void addPro() throws InterruptedException {
		try {
			lock.lock();
			while (Conyy >= 10) {
				producer.await();
			}
			Conyy++;
			System.out.println(Thread.currentThread().getName() + "生产者生产了" + Conyy);
			TimeUnit.SECONDS.sleep(1);
			consumer.signalAll();
			//
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}

	}

	public void xiaofei() throws InterruptedException {
		try {
			lock.lock();
			while (Conyy < 0) {
				consumer.await();
			}

			System.out.println(Thread.currentThread().getName() + "消费者消费" + Conyy);
			TimeUnit.SECONDS.sleep(1);
			Conyy--;// 减掉一个就要唤醒其他线程 生产
			producer.signalAll();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}

	}

	public static void main(String[] args) {
		Demozh d = new Demozh();

		new Thread(() -> {
			while (true)
				try {
					d.addPro();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}).start();

		new Thread(() -> {
			while (true)
				try {
					d.xiaofei();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}).start();
	}

}
