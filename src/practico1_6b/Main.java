package practico1_6b;

import practico1_1.MyIterator;
import practico1_6b.MySimpleLinkedList;

public class Main {

	public static void main(String[] args) {

		MySimpleLinkedList lista1 = new MySimpleLinkedList();
		MySimpleLinkedList lista2 = new MySimpleLinkedList();
		MySimpleLinkedList lista3 = new MySimpleLinkedList();
		// MySimpleLinkedList lista_ordenada = new MySimpleLinkedList();

		lista1.insertLast(1);
		lista1.insertLast(3);
		lista1.insertLast(9);
		lista1.insertLast(15);
		lista1.insertLast(16);
		lista1.insertLast(19);
		lista1.insertLast(100);

		System.out.println("Lista 1 - size: " + lista1.size());

		lista2.insertLast(3);
		lista2.insertLast(7);
		lista2.insertLast(9);
		lista2.insertLast(11);
		lista2.insertLast(19);
		lista2.insertLast(22);
		lista2.insertLast(23);
		lista2.insertLast(65);

		System.out.println("Lista 2 - size: " + lista2.size());

		lista3.insertLast(0);
		lista3.insertLast(2);
		lista3.insertLast(4);
		lista3.insertLast(5);
		lista3.insertLast(6);
		lista3.insertLast(11);
		lista3.insertLast(15);
		lista3.insertLast(18);
		lista3.insertLast(65);
		lista3.insertLast(100);
		
		System.out.println(lista1.toString());
		System.out.println(lista2.toString());
		System.out.println(lista3.toString());

		// implementacion

		lista1.get_elem_comunes_y_ordenados(lista1, lista2);
		
		System.out.println("---");
		
		lista1.get_elem_comunes_y_ordenados(lista3, lista1);
	}
}
