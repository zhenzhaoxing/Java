package BSTmMap;



public class BST<Key extends Comparable<Key> ,Value> {
             //内部类
	   //内部类
   	private class Node{
	      public	Key k;
	      public   Value v;
		  public Node right;
		  public Node left;
		  public Node(Key k,Value v){
			  this.k=k;
			  this.v=v;
			  right=null;
			  left=null;
		  }
	   }

   	
   	private Node root;
   	private int size;
   public BST(){
	   root=null;
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
    public void add(Key k,Value v){
      root = add(root,k,v);//以root为根 的全颗数
    }
    
    
    private Node add(Node node ,Key k,Value v){//node 就是 root        2
    	
    if(node==null){
    	size++;	
    	return new Node(k ,v);		
    	}	
    if(k.compareTo(node.k)<0){//这个比根目录小
    	node.left=add(node.left,k,v);//给2  判断做目录是否为空 要是为空就直接 传对象
    }else{
    	node.right=add(node.right,k,v);
    }
    	return node;
    }
    
/************************************************/
   //查看是否有这个node
    public Node getNode(Node node,Key k){
    	
    	if(node==null){
    		return null;
    	}
    	if(k.compareTo(node.k)>0){
    		return getNode(node.right, k);
    	}
    	else if(k.compareTo(node.k)<0){
    		return getNode(node.left, k);
    	}
    	else{//相等的时候
    		return node;
    	}
    }
    
    
    
    //查询2叉树 看是否有 这个数据
    /*
     * 把以root为根的数 传入
     * */
    public boolean contains(Key k){
    	return getNode(root,k)!=null ;
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
    	System.out.println(node.v);
    	
    	preOrder(node.right);
    	
    }
     
    /**************************************************/
	
    
    
    //根据k找到值
    public Value get(Key k){
    	Node node= getNode(root, k);
    	return node==null ? null:node.v;
    }
    
    
    //更新数据
    public void set(Key k,Value newValue){
    	
    	Node node=getNode(root, k);
    	if(node!=null){
    		node.v=newValue;
    	}
    	
    }
    
    
   /**********************删除元素和获取元素*******************************/
  
    private Node minmum(Node node) {
		if(node.left==null){
			return node;
		}
		return minmum(node.left);
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

    
    
    
    //删除指定的节点 然后返回删除的值
    public Value remove(Key k){
    	Node node = getNode(root, k);
    	if(node!=null){
    	root= remove(root,k);
    	return node.v;
    	}
    	return null;
    }
    //删除掉以node为根的2分搜索树中键为key的节点
    //返回删除后的新数据
    private  Node  remove(Node node,Key k){
    	if(node==null){
    		return null;
    	}
    if(k.compareTo(node.k)<0){
    	 node.left = remove(node.left,k);
     return node;   
    
    }
    else if(k.compareTo(node.k)>0){
    	node.right = remove(node.right, k);
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
