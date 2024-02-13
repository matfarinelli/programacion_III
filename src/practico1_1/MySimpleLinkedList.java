package practico1_1;

import java.util.Iterator;

public class MySimpleLinkedList implements Iterable<Integer> {

	protected Node first;
	protected Node last;
	protected int size;

	public MySimpleLinkedList() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}

	public void insertFront(Integer info) {
		Node tmp = new Node(info, null);
		tmp.setNext(this.first);
		this.first = tmp;
		this.size++;
	}
	
	public void deleteFront() {
		//Node tmp = new Node();
		//tmp = first;
		first = first.getNext();
		
	}

	public void insertLast(Integer o) {

		Node last = new Node(o, null);

		if (this.first == null) {
			insertFront(o);
		} else {

			Node tmp = first;
			// mientras el nodo first tenga siguiente, itero
			while (tmp.getNext() != null) {
				tmp = tmp.getNext();
			}

			tmp.setNext(last);
			this.size++;
		}
	}

	public Integer extractFront() {

		if (!this.isEmpty()) {
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

		// o con el size
		/*
		 * if (this.size > 0) { return false; } else return true;
		 */
	}

	public Integer get(int index) {
		if ((0 <= index) && (index < this.size())) {
			int contador = 1;
			Node cursor = first;
			while (contador < index) { // O(size)
				cursor = cursor.getNext();
				contador++;
			}
			return cursor.getInfo();
		} else
			return null;
	}

	public int size() {
		/*
		 * int contador = 0; Node cursor = first;
		 * 
		 * while (cursor!=null) { cursor = cursor.getNext(); contador++; } return
		 * contador;
		 */
		// O(n = size)

		return this.size;
	}

	public int indexOf(Integer info) {
		int index = 0;
		Node cursor = first;

		while (cursor.getNext() != null) {

			if (cursor.getInfo() == info) {
				return index;
			}

			cursor = cursor.getNext();
			index++;

		}

		// lo necesito para analizar el último cursor
		if ((cursor.getInfo() != info) && (cursor.getNext() == null)) {
			index = -1;
		}

		return index;

	}

	@Override
	public String toString() {
		String info = "";

		Node tmp = first;

		System.out.println("Info de lista: ");
		for (int i = 0; i < this.size; i++) {
			info = info + " - " + tmp.getInfo();
			tmp = tmp.getNext();
		}

		return info;
	}

	@Override
	// public iterator<Integer> iterator() Es lo mismo! funciona de cualq. manera
	public MyIterator iterator() {
		return new MyIterator(first);
	}

}

/*
 * NOTAS: RESPECTO AL SIZE: hay que tener cuidado con size++ y size--, ya que
 * cuando la lista esta vacía , puede que size quede en negativo por ej.
 */