package jylinkList;
/*
 * 以前的数组 栈 队列 底层都是依托静态数组实现的
 * 
 * 而链表是动态数据结构
 * 优点是：真正的动态，不需要处理固定容量的问题
 * 缺点：丧失了随机访问的能力 查询慢
 * 
 * 时间复杂度分析 addLast(e) O(n)
 *          addfirst(e) O(1)
 *          与数组相反
 *          add(index e) O(n)
 * */

public class LinkedList<E> {

	
	
	//内部类成员内部类可以无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）。
	private class Node{
		public E e;
		public Node next;//指向Node的引用 下一个
		
		public Node(E e,Node next){
			this.e=e;
			this.next=next;
		}
		public Node(){
			
		}
	

		public Node(E e) {
			this.e=e;
		}
		@Override
		public String toString() {
			//return "Node [e=" + e + ", next=" + next + "]";
	         return e.toString();
		}
		
	}
	
	
	
	
	
	
	    private Node dummyhead; //虚拟头部 
		private int size;
		public LinkedList(){
			dummyhead=new Node(null,null);
			size=0;
		}
		
		
		
        //获取链表中的个数
		public int getSize(){
			return size;
		}
		//判断是否为空
		public boolean isEmpty(){
			return size==0;
		}
	
		
		
		
		
		
		
		
		//在链表中间添加数据 链表中无索引这一说 这里做练习用
		public void add(int index,E e) {
			if(index<0 ||index>size)
				throw new IllegalArgumentException("ADD is cuo");
		
			
				
				Node prev = dummyhead;//首先找到index前一个的 pref
				for(int i=0;i<index;i++){
			      prev = prev.next;
				}
				Node node = new Node(e);
				node.next=prev.next;
				prev.next=node;
				size++;
			
			}
			
			
		
		
		
		
		
		//向尾部添加数据
		public void addlast(E e) {
			add(size, e);
			size++;
		}
		
		
		
		//向头部添加数据
		public void addfirst(E e) {
//					Node node = new Node(e);
//					node.next=head;
//					head =node;
					// head = new Node(e,head);
					add(0,e);
//					size++;
				}
		
		
		
		
		
		//获得数据
		public E get(int index){
			if(index<0 ||index>size)
				throw new IllegalArgumentException("ADD is cuo");
		
			
			Node cur = dummyhead.next;
			
			for(int i=0;i<index;i++){
				cur=cur.next;
			}
			
			return cur.e;
		}
		
		
		
		//获得链表的第一个元素
		public E getFirst(){
			return get(0);
		}
		
		
		
		
		//更改元素
		public void setXin(int index,E e){
			
			if(index<0 ||index>size)
				throw new IllegalArgumentException("ADD is cuo");
			
			
			Node cur = dummyhead.next;
			for(int i=0;i<index;i++){
				cur=cur.next;
			}
			cur.e=e;
			
		}
		
		
		
		
		//查找链表是否有元素e
		public boolean contains(E e){
			boolean flag=false;
			
			Node cur =dummyhead.next;
			while(cur!=null){
				if(cur.e.equals(e)){
					flag= true;
				}
				cur =cur.next;
				
			}
			return flag;
			
		  }
		
		
		
		
		
		//在链表中删除元素
		public void remove(int index){

			if(index<0 ||index>size)
				throw new IllegalArgumentException("ADD is cuo");
			//寻找代删除的元素之前的节点
			Node prev = dummyhead;//首先找到index前一个的 pref
			for(int i=0;i<index;i++){
				prev=prev.next;
			}
			Node node = new Node();
			node=prev.next;
			prev.next=node.next;
			node.next=null;
			size--;
		 }
		
		//删除第一个元素
		public void removeFirst(){
			
			remove(0);
		}
		
		
		//删除最后一个元素
		public void removeLast(){
					
			remove(size-1);
		}
				
		
		
		
		//用来显示数据
		public String toString(){
			
		StringBuilder res = new StringBuilder();
		Node cur = dummyhead.next;
		while(cur!=null){
		res.append(cur.e +"->");
		cur=cur.next;
		}
			res.append("null");
			return res.toString();
		
		
			
		}



		public void remove(E elment) {
			
			
		}
		
	}

