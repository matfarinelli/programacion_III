package practico1_1_iterator;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		MySimpleLinkedList lista = new MySimpleLinkedList();

		lista.insertFront(1);
		lista.insertFront(2);
		lista.insertFront(3);
		lista.insertFront(4);
		lista.insertFront(5);

		// creo iterador mediante LISTA!
		Iterator<Integer> it = lista.iterator();

		while (it.hasNext()) { // O(n) n = cantidad elementos de la lista
			System.out.println(it.next()); // O(1)
		}

		// implemento MyIterator para usar funcionalidades extras añadidas - getValor y avanzar
		MyIterator it2 = lista.iterator();

		System.out.println("---------");
		
		System.out.println(it2.getValor());
		it2.avanzar();
		System.out.println(it2.getValor());
	}

}
