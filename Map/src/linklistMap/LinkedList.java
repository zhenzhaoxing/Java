package linklistMap;
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

public class LinkedList<Key,Value> {

	
	
	//内部类成员内部类可以无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）。
	private class Node{
		public Key k;
		public Value v;
		public Node next;//指向Node的引用 下一个
		
		public Node(Key k,Value v,Node next){
			this.k=k;
		this.v=v;
			this.next=next;
		}
		public Node(){
			
		}
	

		public Node(Key k) {
			this.k=k;
		}
		@Override
		public String toString() {
			//return "Node [e=" + e + ", next=" + next + "]";
	         return k.toString()+":"+v.toString();
		}
		
	}
	
	    private Node dummyhead; //虚拟头部 
		private int size;
		public LinkedList(){
			dummyhead=new Node();
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
	
		//根据键找node引用
		private Node getNode(Key k){
			
			Node cur =dummyhead.next;
			while(cur!=null){
				if(cur.k.equals(k))
					return cur;
			}
			return null;
		}
		
		
		
		
		
		//在链表中间添加数据 链表中无索引这一说 这里做练习用
		public void add(Key k,Value v) {
			
			
			Node node = getNode(k);
		     if(node==null){
		    	 dummyhead.next = new Node(k, v, dummyhead.next);
		    	 size++;
		     }
		
		}
			
		
		
		
		
	
		
		
		//获得数据
		public Value get(Key k){
			Node node=getNode(k);
		return node==null ? null:node.v;
			
			
		}
		
		
		
		
		
		
		
		//更改元素
		public void set(Key k,Value newValue){
			
			
		Node node=getNode(k);
			if(node==null){
				System.out.println("不存在");
			}
			else{
				node.v=newValue;
			}
			
		}
		
		
		
		
		//查找链表是否有元素e
		public boolean contains(Key k){
			boolean flag=false;
			
			Node cur =dummyhead.next;
			while(cur!=null){
				if(cur.k.equals(k)){
					flag= true;
				}
				cur =cur.next;
				
			}
			return flag;
			
		  }
		
		
		
		
		
		//在链表中删除元素
		public Value remove(Key k){

			
			//寻找代删除的元素之前的节点
			Node prev = dummyhead;//首先找到index前一个的 pref
			while(prev.next!=null){
				if(prev.next.k.equals(k))
					break;
				prev=prev.next;
			}
			if(prev.next!=null){
				Node delNode = prev.next;
				prev.next=delNode.next;
				delNode.next=null;
				size--;
				return delNode.v;
			}
			return null;
		 }
		
	
		
		
		
		//用来显示数据
		public String toString(){
			
		StringBuilder res = new StringBuilder();
		Node cur = dummyhead.next;
		while(cur!=null){
		res.append(cur.v +"->");
		cur=cur.next;
		}
			res.append("null");
			return res.toString();
		
		
			
		}



		
		
	}

