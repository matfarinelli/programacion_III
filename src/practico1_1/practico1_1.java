package practico1_1;

import javax.swing.text.html.HTMLDocument.Iterator;

public class practico1_1 {

	public static void main(String[] args) {

		MySimpleLinkedList lista = new MySimpleLinkedList();

		lista.insertFront(10);
		lista.insertFront(30);
		lista.insertFront(4);
		lista.insertFront(8);
		lista.insertFront(19);
		lista.insertFront(6);
		lista.insertLast(77);

		System.out.println("Size: " + lista.size);
		System.out.println("Index: " + lista.indexOf(10));

		/*
		 * for (int i = 0 ; i < lista.size(); i++) {
		 * System.out.println(lista.extractFront()); // O(1) } // al terminar de iterar,
		 * no queda lista.
		 */

		/*
		 * // O(lista.size * lista.size) // la busqueda binaria en las listas no
		 * funciona. for (int i = 0; i < lista.size(); i++) {
		 * System.out.println(lista.get(i)); // O(lista.size) }
		 */
		/*
		 * // opcion con cursor lista.initCursor(); for (int i = 0; i < lista.size();
		 * i++) { System.out.println(lista.get(i)); // O(lista.size) lista.moveCursor();
		 * }
		 */

		MyIterator it = lista.iterator();
		Integer first = it.get();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(lista.toString());
		;

	}
}
