package Thread_method;

import java.util.Date;
//public void interrupt():�ж��̡߳� ���̵߳�״̬��ֹ�����׳�һ��InterruptedException��
public class ThreadStop {
public static void main(String[] args) {
	ThreadS t = new ThreadS();
t.start();
try {
	Thread.sleep(1000);
	t.interrupt();//�ж��߳�
} catch (InterruptedException e) {
	
	
	e.printStackTrace();
}
	
	
	
}
}





class ThreadS extends Thread{
	@Override
	public void run() {
	
		System.out.println("��ʼִ�У�" + new Date());

		// ��Ҫ��Ϣ10���ӣ��ף���Ҫ������Ŷ
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			System.out.println("�̱߳���ֹ��");
		}

		System.out.println("����ִ�У�" + new Date());
	}
}

		
		
	
	
