package practico1_9;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {

	private Node cursor;

	public MyIterator(Node first) {
		cursor = first;
	}

	@Override
	public boolean hasNext() {
		return cursor != null;
	}

	// devuelve y avanza
	@Override
	public Integer next() {
		Node aux = cursor;
		cursor = cursor.getNext();

		return aux.getInfo();
	}

	public Integer get() {
		return cursor.getInfo();
	}
	
	public Integer getPrev() {
		Node aux = cursor;
		cursor = cursor.getPrev();

		return aux.getInfo();
	}
}
