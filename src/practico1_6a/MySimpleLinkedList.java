package practico1_6a;

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

	public Node getFirst() {
		Node aux = new Node();
		aux = this.first;

		return aux;
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

	// pesimo!! incendia la compu y da stack!
	public MySimpleLinkedList getListaComun(MySimpleLinkedList lista1, MySimpleLinkedList lista2) {
		// recibe dos listas y devuelve una lista ordenada.
		MySimpleLinkedList lista_ordenada = new MySimpleLinkedList();

		// este for busca coincidencias en las 2 listas
		for (Integer valor1 : lista1) {

			int index_buscado = lista2.indexOf(valor1);

			if (index_buscado != -1) {
				// System.out.println("encontrado en: " + index_buscado);
				lista_ordenada.insertarOrdenado(valor1);
			}

		}

		// System.out.println(lista_ordenada);
		// ordenar

		return lista_ordenada;
	}

	public void insertIndex(Integer o, int index) {
		Node prev = first;

		if (index < this.size()) {

			// moverse hasta antes del index señalado
			for (int j = 0; j < index - 1; j++) {
				prev = prev.getNext();
			}

			Node after = prev.getNext();
			// creo nodo nuevo y seteo next
			Node nuevo = new Node(o, after);
			prev.setNext(nuevo);
			this.size++;

		}

	}

	public int buscar_index_menor(Integer info) {

		int index = 0;
		Node cursor = this.first;

		// si el nodo es menor o igual al primero , debe insertar al ppio
		if (info <= cursor.getInfo()) {
			index = 0;
		}

		// iteracion buscando hasta la posicion menor encontrada
		while (cursor.getNext() != null) {

			if (info <= cursor.getInfo()) {
				System.out.println("posicion encontrada para " + cursor.getInfo() + " en index " + index);
				index = index - 1;
			}

			cursor = cursor.getNext();
			index++;

		}

		// lo necesito para analizar el último cursor, si llega al final y no lo
		// encuentra debo insertar al final
		if (cursor.getNext() == null) {
			index = -1;
		}

		//System.out.println(this);
		return index;

	}

	public void insertarOrdenado(Integer o) {

		if (this.isEmpty()) {
			this.insertLast(o);

		} else {
			int index = this.buscar_index_menor(o);

			if (index == -1) {
				this.insertFront(o);
			} else if (index == 0) {
				this.insertLast(o);
			} else
				this.insertIndex(o, index);
		}
		// System.out.println(this);
	}
}
