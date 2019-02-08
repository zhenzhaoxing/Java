package shuzu;

public class Array<E>{

	//数组的底层实现
	
	private E[] date;
	private int size;
	 
	//构造函数，传入数组中的容量
	public Array(int capacity){
		date =  (E[])new Object[capacity];
		size=0;
	}
	
	public Array(){
		date =(E[]) new Object[10];
	}
	
	
	//获取数组中的元素个数
	public int getSize(){
		return size;
	}
	//获取数组的容量
	public int getCapacity(){
		return date.length;
	}
	//向尾部添加元素
	public void addLast(E e){
		date[size]=e;
		size++;
	}

	public boolean isEmpty(){
		return size==0;
	}
	
	
	//向首部添加元素
		public void addFirst(E e){
			
			date[size]=e;
			size++;
		}
	
		
	//在第index位置添加元素的
	public  void add(int index, E e) {
		if(size==date.length) {
		resize(2*date.length);
		}
		if(index<0||index>size)
			throw new IllegalArgumentException("index >=0");	
		//把每一个元素向后移一个 腾出空地
		
		for(int i=size-1;i>=index;i--){
			date[i+1]=date[i];
			date[index]=e;
			size++;
		}
		
	}
	
	
	
	
	
	
	
   private void resize(int capacity) {
		E[] newData =(E[])new Object[capacity];
		//把以前的数据添加到新数组中
		for(int i=0 ;i<size;i++) {
			newData[i]=date[i];
			date = newData;
		}
		
	}

	//修改index索引位置得元素
	public void set(int index,E e){
		if(index<0||index>size)
			throw new IllegalArgumentException("index is error");
		
		date[index]=e;
	}
	
	//查找index的元素
	public int get(int index){
		if(index<0||index>size)
			throw new IllegalArgumentException("index is error");
		return (int) date[index];
	}
	
	public int getFirst(){
		return get(0);
	}
	
	
	//删除元素
	public void delete(int index){
		for(int i=index+1;i<size;i++){
			date[i-1]=date[i];
			
		}
	
		size--;
	
	}
	
	
	public static void main(String[] args) {
		
		Array a = new Array();
	a.addFirst(1);
	System.out.println(a.get(0));
	for(int x=0;x<7;x++){
		a.addFirst(x);
	}
	System.out.println(a.get(4));
	
	int arr[]={0,1,2,3,4};
	for(int s:arr){
		System.out.println(a.get(s));
	}
		
	
	
	
	}
	
}
