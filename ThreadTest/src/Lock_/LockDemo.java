package Lock_;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
 * reentrantLock用于替代synchronized
 *    用这个锁必须自己释放锁 unlock
 *     sync 遇到异常会自动释放锁 但是 loc必须手动释放锁 因此经常在 finally中 进行锁单点释放
 * 
 * */
public class LockDemo {
	Lock lock = new ReentrantLock();// lock锁

	void m1() {
		// synchronized（this）
		try {
			lock.lock();
			for (int i = 0; i < 10; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}

	void m2() {
		lock.lock();
		System.out.println("m2----");
		lock.unlock();
	}

	public static void main(String[] args) {
		LockDemo lo = new LockDemo();

		new Thread(lo::m1).start();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(lo::m2).start();
	}

}
