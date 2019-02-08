package Thread_method;
/*
 * public static void yield():��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳� 
 * �ö���̵߳�ִ�и���г�����ǲ��ܿ�����֤һ��һ�Ρ�
 */

 public class Test{
	 public static void main(String[] args) {
		 ThreadYielDemo ty1 = new ThreadYielDemo();
		 ThreadYielDemo ty2 = new ThreadYielDemo();

			ty1.setName("����ϼ");
			ty2.setName("����");

			ty1.start();
			ty2.start();
}

 }

 class ThreadYielDemo extends Thread {

	@Override
	public void run() {
		for (int x = 0; x < 100; x++) {
			System.out.println(getName() + ":" + x);
			Thread.yield();
		

	}

	}
 }








  