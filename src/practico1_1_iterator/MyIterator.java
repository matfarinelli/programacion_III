package practico1_1_iterator;

import java.util.Iterator;

import practico1_1.Node;

public class MyIterator implements Iterator<Integer>{

	// primero debemos crear un cursor o referencia ---> cursor
	private Node cursor;
	
	//creacion contructor
	public MyIterator(Node first) {
		this.cursor = first;
	}
	
	@Override
	public boolean hasNext() { // O(1)
		// return this.cursor != null;
		
		// o
		if (this.cursor != null) {
			return true;
		} else 
			return false;
		
	}

	@Override
	public Integer next() { // O(1)
		// guardo valor y avanzo
		Integer valor = cursor.getInfo();
		cursor  = cursor.getNext();
		
		return valor;
	}
	
	// implementación otras funcionalidades
	
	public Integer getValor() { // O(1)
		return this.cursor.getInfo();
	}

	
	public void avanzar() { // O(1)
		this.cursor = this.cursor.getNext();
	}
	
	
}
