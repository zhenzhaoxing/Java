package BSTmMap;


import intfaceMap.Map;
//必须是可比较的	 基于Tree的map封装
public class BSTMAP<Key extends Comparable<Key>,Value> implements Map<Key, Value> {

	
	private BST<Key,Value> bst; 
	public BSTMAP(){
		bst = new BST<>();
	}
	
	@Override
	public void add(Key key, Value value) {
		bst.add(key, value);
		
	}

	@Override
	public void delete(Key key) {
	bst.remove(key);
		
	}

	@Override
	public boolean contain(Key key) {
		
		return bst.contains(key);
	}

	@Override
	public void set(Key key, Value newvalue) {
	bst.set(key, newvalue);
		
	}

	@Override
	public Value get(Key key) {
		// TODO Auto-generated method stub
		return bst.get(key);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return bst.size();
	}

	@Override
	public boolean isEmpty() {
	
		return bst.isEmpty();
	}

 
   	
   	
   	
   	
   	
}
