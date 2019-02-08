package jyBSTSet;

public class BSTsSet<E extends Comparable<E>> implements Set<E> {
private BST<E> bst;
//底层使用Tree ，TreeSet就是根据这个来的
public BSTsSet() {
bst = new BST<E>();	
}
	@Override
	public void add(E e) {
		bst.add(e);
		
	}

	@Override
	public void remove(E elment) {
		bst.remove(elment);
		
	}

	@Override
	public boolean contain(E elment) {
	return	bst.contains(elment);
		
	}

	@Override
	public int getSize() {
		
		return bst.size();
	}

	@Override
	public boolean isEmpty() {
		
		return bst.isEmpty();
	}

	
	
	
	
	
}
