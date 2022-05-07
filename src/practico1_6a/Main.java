package practico1_6a;

import practico1_1.MyIterator;

public class Main {

	public static void main(String[] args) {

		MySimpleLinkedList lista1 = new MySimpleLinkedList();
		MySimpleLinkedList lista2 = new MySimpleLinkedList();

		lista1.insertFront(3);
		lista1.insertFront(1);
		lista1.insertFront(9);
		lista1.insertFront(2);
		lista1.insertFront(5);
		lista1.insertFront(8);
		lista1.insertFront(7);
		lista1.insertFront(11);
		lista1.insertFront(15);
		lista1.insertFront(99);
		lista1.insertIndex(19, 1);
		lista1.insertIndex(9, 4);
		lista1.insertIndex(71, 5);
		lista1.insertIndex(69, 8);

		lista2.insertFront(7);
		lista2.insertFront(9);
		lista2.insertFront(10);
		lista2.insertFront(6);
		lista2.insertFront(1);
		lista2.insertFront(5);
		lista2.insertFront(3);

		System.out.println("Lista 1");
		for (Integer item : lista1) {
			System.out.print(" " + item);
		}

		System.out.println("\nLista 2");
		for (Integer item : lista2) {
			System.out.print(" " + item);
		}

		System.out.println("\n");

		// por ahora no inserta ordenado

		MySimpleLinkedList listaOrdenada = new MySimpleLinkedList();

		//System.out.println("Lista ordenada inicio: " + listaOrdenada);

		/*
		 * 
		 * // para implementar for each, la lista debe ser iterable! for (Integer valor1
		 * : lista1) {
		 * 
		 * for (Integer valor2 : lista2) {
		 * 
		 * if (valor1 == valor2) { int valorComun = valor1;
		 * 
		 * // si la lista está vacia , insertar if (listaOrdenada.isEmpty()) {
		 * listaOrdenada.insertFront(valorComun); } else {
		 * 
		 * // si el primer elemento es mas chico que el valorcomun, insertar al frente
		 * // sino, al final if (valorComun < listaOrdenada.first.getInfo()) {
		 * listaOrdenada.insertFront(valorComun);
		 * 
		 * } else { listaOrdenada.insertLast(valorComun); }
		 * 
		 * }
		 * 
		 * System.out.println("Inserto .. : " + valorComun); } }
		 * 
		 * } System.out.println("\nLista ordenada: "); for (Integer valor :
		 * listaOrdenada) { System.out.print(" " + valor); }
		 */

		/*
		 * for (Integer valor1 : lista1) {
		 * 
		 * for (Integer valor2 : lista2) {
		 * 
		 * if (valor1 == valor2) {
		 * 
		 * listaOrdenada.insertFront(valor1); }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println("Lista ordenada final: " + listaOrdenada);
		 */
		
		//System.out.println(lista1.getFirst().getInfo());
		//System.out.println(lista2.getFirst().getInfo());


		System.out.println(listaOrdenada.getListaComun(lista1, lista2));
		
		
		//System.out.println(listaOrdenada.getListaComun(lista1, lista2));
		
	}

}