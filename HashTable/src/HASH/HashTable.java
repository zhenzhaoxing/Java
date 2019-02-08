package HASH;

import java.util.TreeMap;
/**]
 * 创建 有红黑数形成的 数组   
 * @author xiang
 *12/16 =0.75 平衡因子
 * @param <k>
 * @param <V>
 */
public class HashTable<k, V> {
    
	//扩容
	private static final int upperTol=10;
	//降容
	private static final int lowerTol=2;
	//默认容量
	private static final int initCapacity=7;
    
	private TreeMap<k, V>[] hashtable;
	  int M;// 哈希表的容量
	private int size;// 哈希表所存的数量
	
	/**
	 * 初始化
	 * 
	 * @param M
	 */
	public HashTable(int M) {
		this.M = M;
		size = 0;
		hashtable = new TreeMap[M];
		for (int i = 0; i < M; i++) {
			hashtable[i] = new TreeMap<>();
		}
	}

	
	public HashTable() {
		this.M=initCapacity;
		size = 0;
		hashtable = new TreeMap[M];
		for (int i = 0; i < M; i++) {
			hashtable[i] = new TreeMap<>();
		}
	}

	public int getSize() {
		return size;
	}

	// 获取hash函数值 作为索引值
	public int hashco(k q) {
		return (q.hashCode() & 0x7fffffff) % M;

	}

	/**
	 * 添加
	 * 
	 * @param key
	 * @param value
	 */
	public void add(k key, V value) {
		TreeMap<k, V> map = hashtable[hashco(key)];
		if (map.containsKey(key)) {// 根据索引看里面包含key？ 有加添加 没有 也添加
			map.put(key, value);
		} else {
			map.put(key, value);
			size++;
			//当元素个数 大于 了平衡因子 与 地址数的乘积
			if(size>=M*upperTol){
				resize(2*M);
			}
		}

	}
	/**
	 *移除
	 * 
	 * @param key
	 * @return
	 */
	public V remove(k key) {
		TreeMap<k, V> map = hashtable[hashco(key)];
		V s = null;
		if (map.containsKey(key)) {
			s = map.remove(key);
			size--;
			if(size<M*lowerTol&&M/2>0){
				resize(M/2);
			}
		}

		return s;

	}
	
	/**
	 * 重置
	 * 
	 * @param key
	 * @return
	 */
	public void set(k key, V value) {
		TreeMap<k, V> map = hashtable[hashco(key)];
		if (map.containsKey(key)) {
			map.put(key, value);
		} else {
			throw new IllegalArgumentException(key + "does't not");
		}

	}

	/**
	 * 是否包含
	 * 
	 * @param key
	 * @return
	 */
	public boolean contain(k key) {
		TreeMap<k, V> map = hashtable[hashco(key)];

		return map.containsKey(key) ? true : false;
	}
	
	public V get(k key){
		TreeMap<k, V> map = hashtable[hashco(key)];
		V s = null;
		if(map.containsKey(key)){
			s=map.get(key);
		}
		return s;
	}
	
	//对原 进行扩容 和降容操作
	private void resize(int newM) {
		
		TreeMap<k, V>[] newhashtable= new TreeMap[newM];
		//现实例化
		for(int i=0;i<newM;i++){
			newhashtable[i] = new TreeMap<>();
		}
		
		
		int oldm=M;//老的容量
		this.M=newM;
		
		//然后把老的数据 放进新的  newhashtable 里面
		for (int i = 0; i < oldm; i++) {
			TreeMap<k, V> map =hashtable[i];
			for (k key : map.keySet()) {//遍历老祖里面的key
				newhashtable[hashco(key)].put(key, map.get(key));
			}
		}
		this.hashtable=newhashtable;
		
	}



}
