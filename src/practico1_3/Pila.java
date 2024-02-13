package practico1_3;

import java.util.Iterator;

import practico1_1.MySimpleLinkedList;

public class Pila {

	private MySimpleLinkedList lista;

	public Pila() {
		this.lista = new MySimpleLinkedList();
	}

	public Integer top() {
		return this.lista.get(0);
	}

	public void push(Integer valor) {
		this.lista.insertFront(valor);
	}

	public Integer pop() {
		return this.lista.extractFront();
	}

	public void reverse() {
		MySimpleLinkedList aux = new MySimpleLinkedList();

		while (!this.lista.isEmpty()) {
			// en la lista auxiliar, voy insertando las ultimas de la lista original
			aux.insertFront(this.lista.extractFront());
		}

		this.lista = aux;
	}


}
