package practico1_1_iterator;

import java.util.Iterator;

import practico1_1.Node;

public class MySimpleLinkedList implements Iterable<Integer> {

	protected Node first;
	protected Node last; // referencia al último
	protected int size;

	public MySimpleLinkedList() {
		this.first = null;
		this.size = 0;
		// this.cursor = null;
	}

	public void insertFront(Integer info) {
		Node tmp = new Node(info, null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size++;
		// this.cursor = first;
	}

	public void insertLast(Integer o) {
		// creo mi último nodo y asigno null al enlace ya que es final de lista
		Node last = new Node(o, null);
				
		// creo un segundo nodo aux, copia del FIRST para seguir el recorrido de nodos hasta el ultimo
		Node tmp2 = first;
		
		while (tmp2.getNext() != null) {
			tmp2 = tmp2.getNext();
		}
		
		tmp2.setNext(last);
		
		this.size++;
	}

	public Integer extractFront() {

		if (!isEmpty()) {
			Node tmp = first;
			first = tmp.getNext();
			this.size--;
			return tmp.getInfo();
		}

		else
			return null;
	}

	public boolean isEmpty() {

		return this.first == null;

	}

	// VER
	// precondicion 1<=index<=size()
	public Integer get(int index) {
		if (size > 0) {
			int contador = 1;
			Node cursor = first;
			while (contador < index) { // O(size)
				cursor = cursor.getNext();
				contador++;
			}
			return cursor.getInfo();
		} else
			return 0;
	}

	public int size() {
		return this.size;
	}
	
	public int indexOf(Node o) {
		int index = 0;
		
		Node cursor = first;
		
		while (cursor.getNext() != null){

			if (cursor.getInfo().equals(o.getInfo())) {
				return index;
			}
			
			cursor = cursor.getNext();
			index++;
			
		}
		
		if (index >= this.size) {
			index = -1;
		}
			
		return index;
		
	}

	@Override
	public String toString() {
		// TODO
		return "";
	}

	@Override

	// public Iterator<Integer> iterator() {
	public MyIterator iterator() {
		// creo un cursor y le asigno first para que empiece del principio
		return new MyIterator(this.first);
	}

}
