package jyBSTSet;

public class BST<E extends Comparable<E>> {
             //内部类
    	private class Node{
	      public	E e;
		  public Node right;
		  public Node left;
		  public Node(E e){
			  this.e=e;
			  right=null;
			  left=null;
		  }
	   }
	    //构造方法和属性
	   private Node root;
       private int size;
	      public BST(){
		     root =null;
		       size=0;
	      }
	    //写个数
	    public int size(){
		   return size;
	    }
	    //判断是否为空
        public boolean isEmpty(){
	       return size==0;
       }

    /********************************************/
        //向二分搜索树添加新的元素e
    public void add(E e){
      root = add(root,e);//以root为根 的全颗数
    }
    
    
    private Node add(Node node ,E e){//node 就是 root        2
    	
    if(node==null){
    	size++;	
    	return new Node(e);		
    	}	
    if(e.compareTo(node.e)<0){//这个比根目录小
    	node.left=add(node.left,e);//给2  判断做目录是否为空 要是为空就直接 传对象
    }else if(e.compareTo(node.e)>0){
    	node.right=add(node.right,e);
    }
    	return node;
    }
    
/************************************************/
    
    
    
    
    //查询2叉树 看是否有 这个数据
    /*
     * 把以root为根的数 传入
     * */
    public boolean contains(E e){
    	return contains(root,e);
    }
    
   // BST<E>.Node root2
    private boolean contains(Node node, E e) {
		if(node==null){
        return false;}
		
		if(e.compareTo(node.e) == 0){//树的数相同的话就 返回true
			return true;
		}
		
		else if(e.compareTo(node.e)<0){//数e小于root 在左边查找
			return contains(node.left, e);//递归调用
	
		}
		else{//在右边查找
			return contains(node.right, e);
		}
	}
    
    
    
    /****************************************************/
    //遍历输出//前序遍历，中序遍历，后序遍历
    public void preOrder(){
    	preOrder(root);
    }
    
    public void preOrder(Node node){
    	if(node == null){
    		return;
    	}
    	//前序遍历
    	
    	preOrder(node.left);
    	System.out.println(node.e);
    	preOrder(node.right);
    	
    }
     
    /**************************************************/
	//输出显示
    public void print(){
    	//Node roo= root;
    	System.out.println(root.e);
    	System.out.println(root.left.e);
    }
    
    
    
    
    
   /**********************删除元素和获取元素*******************************/
  //获取最小值
    public E minmum(){
    	if(size==0)
    		throw new IllegalArgumentException("BST IS EMPTY");
    	return minmum(root).e;
    	
    	
    }
    private Node minmum(Node node) {
		if(node.left==null){
			return node;
		}
		return minmum(node.left);
	}
    
    
    //删除最小值所在节点，返回最小值
    public E reoveMin(){
    	E ret =minmum();//获取最小值
    	root = removeMin(root);
		return ret;
    
    }

    private Node removeMin(Node node){
		if(node.left==null){
			//有可能这个节点的右边有值所以就
	  Node Noderight = node.right;
	    //让这个node完全脱离关系
	    node.right=null;
	     size--;
		return Noderight;
		
		}
    	
		//递归调用
    	node.left  = removeMin(node.left);
    	return node;
    }
/*****************************************************************/    

    
    
    
    //删除指定的节点 然后返回以root为根的新节点
    public void remove(E e){
    	root= remove(root,e);
    }
    private  Node  remove(Node node,E e){
    	if(node==null){
    		return null;
    	}
    if(e.compareTo(node.e)<0){
    	 node.left = remove(node.left,e);
     return node;   
    
    }
    else if(e.compareTo(node.e)>0){
    	node.right = remove(node.right, e);
    	return node;
    }else{//e==node.e
    	//有三种情况 第一 删除该店的 左边为空 ，右边为空，两边都部位空
    	
    	if(node.left==null){
    		Node rightnode = node.right;
    		node.right=null;//脱离关系
    		size--;
    		return rightnode;
    	}//右边为空
    	if(node.right==null){
    		Node leftnode=node.left;
    		node.left=null;
    		size--;
    		return leftnode;
    	}
    	/*
    	 * 特删除节点左右子树都不为空的情况
    	 * 找到被删除的节点右边 最小的那个 成为后继
    	 * 用·这个顶替 被删除的
    	 * */
    	//最小值
    	Node successor = minmum(node.right);
      //他的右边等于 删除最小值后的
    	successor.right=removeMin(node.right);
    	//左边等于 原node的左边
    	successor.left=node.left;
    	
    	node.right=node.left=null;//销毁
    	return successor;
    }
    	
    	
    	
    }
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
