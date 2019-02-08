package jylinkList;

import jyBSTSet.Set;

public class LinkedListSet<E> implements Set<E> {
private LinkedList<E> link;

 public LinkedListSet() {
	// TODO Auto-generated constructor stub
  link = new LinkedList<>();
 }
	@Override
	public void add(E elment) {
	if(!link.contains(elment)){
		link.addfirst(elment);
	}
		
	}

	@Override
	public void remove(E elment) {
		link.remove(elment);
		
	}

	@Override
	public boolean contain(E elment) {
	return link.contains(elment);
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return link.getSize();
	}

	@Override
	public boolean isEmpty() {
	
		return link.isEmpty();
	}

}
