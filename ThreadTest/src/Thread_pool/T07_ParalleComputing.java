package Thread_pool;
/*求质数   比较一个线程 和多个线程的区别   
*  
*    实现 Callable接口 有返回值
*     2975
    1519
*
*/

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class T07_ParalleComputing {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	
//单线程的调用
	long start = System.currentTimeMillis();
	getPrime(1,200000);
	long end = System.currentTimeMillis();
	System.out.println(end-start);

            final int cpuCorenum=4;
          ExecutorService service = Executors.newFixedThreadPool(4);    		

             MyTask t1 = new MyTask(1, 80000);
             MyTask t2 = new MyTask(80000, 120000);
             MyTask t3 = new MyTask(120000, 170000);
             MyTask t4 = new MyTask(170000, 200000);
             //Future表示异步计算的结果
           Future<List<Integer>> f1 = service.submit(t1);
          Future<List<Integer>> f2 = service.submit(t2);
          Future<List<Integer>> f3 = service.submit(t3);
          Future<List<Integer>> f4= service.submit(t4);
          long star = System.currentTimeMillis();
                   f1.get(); 
                  f2.get();
                  f3.get();
                  f4.get();
                 
                  long entd = System.currentTimeMillis();
              	System.out.println(entd-star);
      }
	
	

static class MyTask implements Callable<List<Integer>> {
	int startPos, endPos;
	
	MyTask(int s, int e) {
		this.startPos = s;
		this.endPos = e;
	}
	
	@Override
	public List<Integer> call() throws Exception {
		List<Integer> r = getPrime(startPos, endPos);
		return r;
	}
	
}



	
	static List<Integer>  getPrime(int start,int end){
		List<Integer> results = new ArrayList<>();
		for(int i=start;i<=end;i++){
			if(isPrime(i))//true 判断是否为质数
				results.add(i);
		}
		
		return results;
	}

	static boolean isPrime(int num) {
           for(int i=2;i<=num/2;i++){
             if(num%i==0) return false;
           }
		return true;
	}
}
