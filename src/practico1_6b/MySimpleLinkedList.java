package practico1_6b;

import java.util.Iterator;

import practico1_1.MyIterator;
import practico1_1.Node;

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

	public MySimpleLinkedList get_elem_comunes_y_ordenados(MySimpleLinkedList l1, MySimpleLinkedList l2) {
		MySimpleLinkedList lista_ordenada = new MySimpleLinkedList();

		MyIterator it1 = l1.iterator();
		MyIterator it2 = l2.iterator();

		while ((it1.hasNext()) && (it2.hasNext())) {

			if (it1.get() == it2.get()) {
				lista_ordenada.insertLast((it1.get()));
				it1.next();
				it2.next();
			} else if (it1.get() < it2.get()) {
				it1.next();
			} else
				it2.next();
		}
		;

		System.out.println("Lista ordenada: " + lista_ordenada.toString());

		return lista_ordenada;
	}

}

/*
 * NOTAS: RESPECTO AL SIZE: hay que tener cuidado con size++ y size--, ya que
 * cuando la lista esta vacía , puede que size quede en negativo por ej.
 */