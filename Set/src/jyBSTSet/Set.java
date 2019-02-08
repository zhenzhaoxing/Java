package jyBSTSet;

public interface Set<E> {

	void add(E elment);
	void remove(E elment);
	boolean contain(E elment);
	int getSize();
	
	boolean isEmpty();
}
